package br.com.data.covid19.feign.estados.service;

import br.com.data.covid19.feign.estados.bean.EstadosBean;
import br.com.data.covid19.feign.estados.client.EstadosBrasilClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EstadosBrasilServiceClient {
    @Autowired
    EstadosBrasilClient estadosBrasilClient;

    public EstadosBean obterUf(String uf){
        return estadosBrasilClient.obterUf(uf);
    }

    public List<EstadosBean> obterTodosEstados(){
        return estadosBrasilClient.obterTodosBr();
    }
}
