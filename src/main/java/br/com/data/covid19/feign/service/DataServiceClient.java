package br.com.data.covid19.feign.service;

import br.com.data.covid19.feign.bean.DataBrResponse;
import br.com.data.covid19.feign.bean.DataUfResponse;
import br.com.data.covid19.feign.client.DataClient;
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
