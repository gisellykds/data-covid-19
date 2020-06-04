package br.com.data.covid19.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class DataBrBean {
    @JsonProperty("pais")
    private String country;
    @JsonProperty("casos")
    private Integer cases;
    @JsonProperty("mortes")
    private Integer deaths;
    @JsonProperty("recuperados")
    private Integer recovered;
    @JsonProperty("data_atualizacao")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss", timezone="GMT-3")
    private Date updatedAt;
}
