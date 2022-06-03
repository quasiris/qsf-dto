package com.quasiris.qsf.dto.query;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.quasiris.qsf.dto.common.BaseDTO;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "opType", defaultImpl = SearchFilterDTO.class)
@JsonSubTypes({
        @JsonSubTypes.Type(value = SearchFilterDTO.class, name = "filter"),
        @JsonSubTypes.Type(value = BoolSearchFilterDTO.class, name = "bool")
})
public abstract class BaseSearchFilterDTO extends BaseDTO {
    public abstract String getOpType();
}
