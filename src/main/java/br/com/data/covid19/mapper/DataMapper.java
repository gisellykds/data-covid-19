package br.com.data.covid19.mapper;

import br.com.data.covid19.bean.DataBeanBrResponse;
import br.com.data.covid19.bean.DataUfBean;
import br.com.data.covid19.feign.bean.DataBrResponse;
import br.com.data.covid19.feign.bean.DataUfResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface DataMapper {
    @Mappings({
            @Mapping(source = "data", target = "dataBean")
    })
    DataBeanBrResponse toBeanFromBrResponse(DataBrResponse dataBrResponse);

    DataUfBean toBeanFromBrUfResponse(DataUfResponse brUf);
}
