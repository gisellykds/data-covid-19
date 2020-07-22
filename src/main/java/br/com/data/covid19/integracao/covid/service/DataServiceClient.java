package br.com.data.covid19.integracao.covid.service;

import br.com.data.covid19.integracao.covid.bean.DataBrResponse;
import br.com.data.covid19.integracao.covid.bean.DataUfResponse;
import br.com.data.covid19.integracao.covid.client.DataClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataServiceClient {
    @Autowired
    DataClient dataClient;

    public DataBrResponse obterTodos() {
        return dataClient.obterTodosBr();
    }

    public DataUfResponse obterDataBrUf(String uf){
        return dataClient.obterDataBrUf(uf);
    }
}
