package br.com.data.covid19.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataBeanBrResponse {
    @JsonProperty("data")
    private DataBrBean dataBean;
}
