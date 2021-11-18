package com.quasiris.qsf.dto.query;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "opType", defaultImpl = SearchFilterDTO.class)
@JsonSubTypes({
        @JsonSubTypes.Type(value = SearchFilterDTO.class, name = "filter"),
        @JsonSubTypes.Type(value = BoolSearchFilterDTO.class, name = "bool")
})
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class BaseSearchFilterDTO implements Serializable {
    public abstract String getOpType();
}
