package br.com.data.covid19.feign.client;

import br.com.data.covid19.feign.bean.DataBrResponse;
import br.com.data.covid19.feign.bean.DataUfResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "data", url = "https://covid19-brazil-api.now.sh/api/report/v1/brazil")
public interface DataClient {
    @GetMapping("")
    DataBrResponse obterTodosBr();

    @GetMapping("/uf/{uf}")
    DataUfResponse obterDataBrUf(@PathVariable(value = "uf") String uf);
}
