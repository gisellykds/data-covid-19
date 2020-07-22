package br.com.data.covid19.feign.estados.client;

import br.com.data.covid19.feign.estados.bean.EstadosBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@FeignClient(name = "data", url = "https://servicodados.ibge.gov.br/api/v1/localidades/estados")
public interface EstadosBrasilClient {
    @GetMapping("")
    List<EstadosBean> obterTodosBr();

    @GetMapping("/{uf}")
    EstadosBean obterUf(@PathVariable(value = "uf") String uf);
}
