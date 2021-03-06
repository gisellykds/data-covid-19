package br.com.data.covid19.integracao.estados.client;

import br.com.data.covid19.integracao.estados.bean.EstadosBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "estados", url = "https://servicodados.ibge.gov.br/api/v1/localidades/estados")
public interface EstadosBrasilClient {

    @GetMapping("/{uf}")
    EstadosBean obterUf(@PathVariable(value = "uf") String uf);

}
