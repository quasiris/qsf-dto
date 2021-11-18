package com.quasiris.qsf.dto.query;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BoolSearchFilterDTO extends BaseSearchFilterDTO {
    private List<BaseSearchFilterDTO> and;
    private List<BaseSearchFilterDTO> or;
    private List<BaseSearchFilterDTO> not;

    public List<BaseSearchFilterDTO> getAnd() {
        return and;
    }

    public void setAnd(List<BaseSearchFilterDTO> and) {
        this.and = and;
    }

    public List<BaseSearchFilterDTO> getOr() {
        return or;
    }

    public void setOr(List<BaseSearchFilterDTO> or) {
        this.or = or;
    }

    public List<BaseSearchFilterDTO> getNot() {
        return not;
    }

    public void setNot(List<BaseSearchFilterDTO> not) {
        this.not = not;
    }

    @Override
    public String getOpType() {
        return "bool";
    }
}
