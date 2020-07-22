package br.com.data.covid19.controller;

import br.com.data.covid19.bean.DataBeanBrResponse;
import br.com.data.covid19.bean.DataUfBean;
import br.com.data.covid19.service.DataCovidService;
import br.com.data.covid19.service.EstadosBrasilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@RestController
@RequestMapping(path = "api/v1/covid/data", produces = "application/json")
@Configuration
@CrossOrigin
@Validated
public class DataController {
    @Autowired
    DataCovidService dataService;
    @Autowired
    EstadosBrasilService estadosBrasilService;

    @GetMapping("")
    public DataBeanBrResponse obterCasosBr() {
        return dataService.obterTodos();
    }

    @GetMapping("/{uf}")
    public DataUfBean obterCasosUf(@PathVariable(value = "uf") @Valid @NotBlank @Size(max = 2, min = 2) String uf) {
        estadosBrasilService.verificaExistenciaEstado(uf);
        return dataService.obterDataBrUf(uf);
    }
}
