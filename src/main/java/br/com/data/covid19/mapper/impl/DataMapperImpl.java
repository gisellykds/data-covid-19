package br.com.data.covid19.mapper.impl;

import br.com.data.covid19.bean.DataBeanBrResponse;
import br.com.data.covid19.bean.DataBrBean;
import br.com.data.covid19.bean.DataUfBean;
import br.com.data.covid19.exception.ErrosDadosSaidaApi;
import br.com.data.covid19.integracao.covid.bean.BrResponse;
import br.com.data.covid19.integracao.covid.bean.DataBrResponse;
import br.com.data.covid19.integracao.covid.bean.DataUfResponse;
import br.com.data.covid19.mapper.DataMapper;

public class DataMapperImpl implements DataMapper {

    @Override
    public DataBeanBrResponse toBeanFromBrResponse(DataBrResponse dataBrResponse) {
        DataBeanBrResponse dataBeanBrResponse = new DataBeanBrResponse();
        dataBeanBrResponse.setDataBean( brResponseToDataBrBean( dataBrResponse.getData() ) );
        return dataBeanBrResponse;
    }

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

    protected DataBrBean brResponseToDataBrBean(BrResponse brResponse) {
        DataBrBean dataBrBean = new DataBrBean();
        dataBrBean.setCountry( brResponse.getCountry() );
        dataBrBean.setCases( brResponse.getCases() );
        dataBrBean.setDeaths( brResponse.getDeaths() );
        dataBrBean.setRecovered( brResponse.getRecovered() );
        dataBrBean.setUpdatedAt( brResponse.getUpdatedAt() );
        return dataBrBean;
    }
}
