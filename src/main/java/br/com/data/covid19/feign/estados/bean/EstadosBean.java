package br.com.data.covid19.feign.estados.bean;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class EstadosBean {
    private Integer id;
    private String sigla;
    private String nome;
    private RegiaoEstado regiao;
}
