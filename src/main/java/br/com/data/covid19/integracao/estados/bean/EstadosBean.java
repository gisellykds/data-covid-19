package br.com.data.covid19.integracao.estados.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EstadosBean {
    private Integer id;
    private String sigla;
    private String nome;
    private RegiaoEstado regiao;
}
