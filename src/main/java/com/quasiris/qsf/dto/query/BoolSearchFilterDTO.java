package com.quasiris.qsf.dto.query;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BoolSearchFilterDTO extends BaseSearchFilterDTO {
    private List<BaseSearchFilterDTO> filters;
    private FilterOperator operator;

    public List<BaseSearchFilterDTO> getFilters() {
        return filters;
    }

    public void setFilters(List<BaseSearchFilterDTO> filters) {
        this.filters = filters;
    }

    public FilterOperator getOperator() {
        return operator;
    }

    public void setOperator(FilterOperator operator) {
        this.operator = operator;
    }

    @Override
    public String getOpType() {
        return "bool";
    }
}
