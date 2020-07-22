package br.com.data.covid19.service;

import br.com.data.covid19.bean.DataBeanBrResponse;
import br.com.data.covid19.bean.DataUfBean;
import br.com.data.covid19.feign.covid.bean.DataBrResponse;
import br.com.data.covid19.feign.covid.bean.DataUfResponse;
import br.com.data.covid19.feign.covid.service.DataServiceClient;
import br.com.data.covid19.mapper.DataMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {
    @Autowired
    private DataServiceClient client;

    private DataMapper dataMapper = Mappers.getMapper(DataMapper.class);

    public DataBeanBrResponse obterTodos(){
        DataBrResponse br = client.obterTodos();
        DataBeanBrResponse bean = dataMapper.toBeanFromBrResponse(br);
        return bean;
    }

    public DataUfBean obterDataBrUf(String uf){
        DataUfResponse brUf = client.obterDataBrUf(uf);
        DataUfBean bean = dataMapper.toBeanFromBrUfResponse(brUf);
        return bean;
    }

}
