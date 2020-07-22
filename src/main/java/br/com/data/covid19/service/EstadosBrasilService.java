package br.com.data.covid19.service;

import br.com.data.covid19.exception.UfNaoEncontradaException;
import br.com.data.covid19.integracao.estados.client.EstadosBrasilClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadosBrasilService {
    @Autowired
    private EstadosBrasilClient client;

    public void verificaExistenciaEstado(String uf) {
        try{
            client.obterUf(uf);
        }catch (Exception e){
            throw new UfNaoEncontradaException();
        }
    }
}
