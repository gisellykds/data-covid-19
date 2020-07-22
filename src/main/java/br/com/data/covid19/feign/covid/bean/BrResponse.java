package br.com.data.covid19.feign.covid.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BrResponse {

    private String country;
    private Integer cases;
    private Integer deaths;
    private Integer recovered;
    @JsonProperty("updated_at")
    private Date updatedAt;

}
