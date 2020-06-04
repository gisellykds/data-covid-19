package br.com.data.covid19.controller;

import br.com.data.covid19.bean.DataBeanBrResponse;
import br.com.data.covid19.bean.DataUfBean;
import br.com.data.covid19.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/covid/data", produces = "application/json")
@Configuration
@CrossOrigin
public class DataController {
    @Autowired
    DataService dataService;

    @GetMapping("")
    public DataBeanBrResponse obterCasosBr() {
        return dataService.obterTodos();
    }

    @GetMapping("/{uf}")
    public DataUfBean obterCasosUf(@PathVariable(value = "uf") String uf) {
        return dataService.obterDataBrUf(uf);
    }

}
