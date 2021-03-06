package br.com.data.covid19.service;

import br.com.data.covid19.bean.DataBrBean;
import br.com.data.covid19.bean.DataUfBean;
import br.com.data.covid19.exception.ErrosDadosSaidaApi;
import br.com.data.covid19.exception.UfNumericaException;
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

    public DataBrBean obterTodos(){
        DataBrResponse br = client.obterTodos();
        DataBrBean bean = verificaDadosSaida(br);
        return bean;
    }

    public DataUfBean obterDataBrUf(String uf){
        verificaSeUfEhNumerico(uf);
        estadosBrasilService.verificaExistenciaEstado(uf);
        DataUfResponse brUf = client.obterDataBrUf(uf);
        DataUfBean bean = verificaDadosSaidaUf(brUf);
        return bean;
    }

    private DataBrBean verificaDadosSaida(DataBrResponse br){
        try{
            return dataMapper.brResponseToDataBrBean(br);
        }catch (Exception e){
            throw new ErrosDadosSaidaApi();
        }
    }

    private DataUfBean verificaDadosSaidaUf(DataUfResponse brUf){
        try{
            return dataMapper.toBeanFromBrUfResponse(brUf);
        }catch (Exception e){
            throw new ErrosDadosSaidaApi();
        }
    }

    private void verificaSeUfEhNumerico(String uf){
        Boolean numerico = uf.chars().allMatch(Character::isDigit);
        if(numerico.equals(true)){
            throw new UfNumericaException();
        }
    }

}
