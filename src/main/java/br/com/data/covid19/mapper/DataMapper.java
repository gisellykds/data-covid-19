package br.com.data.covid19.mapper;

import br.com.data.covid19.bean.DataBeanBrResponse;
import br.com.data.covid19.bean.DataUfBean;
import br.com.data.covid19.integracao.covid.bean.DataBrResponse;
import br.com.data.covid19.integracao.covid.bean.DataUfResponse;

public interface DataMapper {
    DataBeanBrResponse toBeanFromBrResponse(DataBrResponse dataBrResponse);

    DataUfBean toBeanFromBrUfResponse(DataUfResponse brUf);
}
