package br.com.data.covid19.feign.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataBrResponse {

    @JsonProperty("data")
    public BrResponse data;

}
