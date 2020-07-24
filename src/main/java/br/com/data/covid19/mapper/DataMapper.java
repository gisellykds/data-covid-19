package br.com.data.covid19.mapper;

import br.com.data.covid19.bean.DataBrBean;
import br.com.data.covid19.bean.DataUfBean;
import br.com.data.covid19.integracao.covid.bean.DataBrResponse;
import br.com.data.covid19.integracao.covid.bean.DataUfResponse;

public interface DataMapper {

    DataUfBean toBeanFromBrUfResponse(DataUfResponse brUf);
    DataBrBean brResponseToDataBrBean(DataBrResponse brResponse);
}
