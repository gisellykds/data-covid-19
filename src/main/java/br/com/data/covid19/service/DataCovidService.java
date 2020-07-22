package br.com.data.covid19.service;

import br.com.data.covid19.bean.DataBeanBrResponse;
import br.com.data.covid19.bean.DataUfBean;
import br.com.data.covid19.exception.ErrosDadosSaidaApi;
import br.com.data.covid19.integracao.covid.bean.DataBrResponse;
import br.com.data.covid19.integracao.covid.bean.DataUfResponse;
import br.com.data.covid19.integracao.covid.service.DataServiceClient;
import br.com.data.covid19.mapper.DataMapper;
import br.com.data.covid19.mapper.impl.DataMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataCovidService {
    @Autowired
    private DataServiceClient client;
    @Autowired
    private EstadosBrasilService estadosBrasilService;
    private DataMapper dataMapper = new DataMapperImpl();

    public DataBeanBrResponse obterTodos(){
        DataBrResponse br = client.obterTodos();
        DataBeanBrResponse bean = verificaDadosSaida(br);
        return bean;
    }

    public DataUfBean obterDataBrUf(String uf){
        estadosBrasilService.verificaExistenciaEstado(uf);
        DataUfResponse brUf = client.obterDataBrUf(uf);
        DataUfBean bean = verificaDadosSaidaUf(brUf);
        return bean;
    }

    private DataBeanBrResponse verificaDadosSaida(DataBrResponse br){
        try{
            DataBeanBrResponse bean = dataMapper.toBeanFromBrResponse(br);
            return bean;
        }catch (Exception e){
            throw new ErrosDadosSaidaApi();
        }
    }

    private DataUfBean verificaDadosSaidaUf(DataUfResponse brUf){
        try{
            DataUfBean bean = dataMapper.toBeanFromBrUfResponse(brUf);
            return bean;
        }catch (Exception e){
            throw new ErrosDadosSaidaApi();
        }
    }
}
