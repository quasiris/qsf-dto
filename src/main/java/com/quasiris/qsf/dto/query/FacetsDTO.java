package com.quasiris.qsf.dto.query;

import com.quasiris.qsf.dto.common.BaseDTO;

import java.util.List;

public class FacetsDTO extends BaseDTO {


    private String id;

    private Integer displayCount;
    private String sort;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getDisplayCount() {
        return displayCount;
    }

    public void setDisplayCount(Integer displayCount) {
        this.displayCount = displayCount;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
