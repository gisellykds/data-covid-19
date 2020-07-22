package br.com.data.covid19.feign.estados.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegiaoEstado {
    private Integer id;
    private String sigla;
    private String nome;
}
