package br.com.data.covid19.mapper.impl;

import br.com.data.covid19.bean.DataBrBean;
import br.com.data.covid19.bean.DataUfBean;
import br.com.data.covid19.integracao.covid.bean.BrResponse;
import br.com.data.covid19.integracao.covid.bean.DataBrResponse;
import br.com.data.covid19.integracao.covid.bean.DataUfResponse;
import br.com.data.covid19.mapper.DataMapper;

public class DataMapperImpl implements DataMapper {

    @Override
    public DataUfBean toBeanFromBrUfResponse(DataUfResponse brUf) {
        DataUfBean dataUfBean = new DataUfBean();
        dataUfBean.setUf( brUf.getUf() );
        dataUfBean.setState( brUf.getState() );
        dataUfBean.setCases( brUf.getCases() );
        dataUfBean.setDeaths( brUf.getDeaths() );
        dataUfBean.setSuspects( brUf.getSuspects() );
        dataUfBean.setDatetime( brUf.getDatetime() );
        return dataUfBean;
    }

    @Override
    public DataBrBean brResponseToDataBrBean(DataBrResponse brResponse) {
        DataBrBean dataBrBean = new DataBrBean();
        dataBrBean.setCountry( brResponse.getData().getCountry() );
        dataBrBean.setCases( brResponse.getData().getCases() );
        dataBrBean.setDeaths( brResponse.getData().getDeaths() );
        dataBrBean.setRecovered( brResponse.getData().getRecovered() );
        dataBrBean.setUpdatedAt( brResponse.getData().getUpdatedAt() );
        return dataBrBean;
    }
}
