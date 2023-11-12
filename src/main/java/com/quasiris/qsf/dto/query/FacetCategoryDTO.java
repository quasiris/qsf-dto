package com.quasiris.qsf.dto.query;

import com.quasiris.qsf.dto.common.BaseDTO;

public class FacetCategoryDTO extends BaseDTO {


    private String id;

    private String value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
