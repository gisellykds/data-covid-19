package br.com.data.covid19.feign.covid.bean;

import lombok.*;

import java.util.Date;

@Getter
@Setter
public class DataUfResponse {

    private Integer uid;
    private String uf;
    private String state;
    private Integer cases;
    private Integer deaths;
    private Integer suspects;
    private Integer refuses;
    private Date datetime;

}
