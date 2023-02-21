package com.quasiris.qsf.dto.response;

import com.quasiris.qsf.dto.common.BaseDTO;

import java.util.List;

/**
 * Created by tbl on 21.02.23.
 */
public class Sort extends BaseDTO {

    private List<SortEntry> sort;

    public List<SortEntry> getSort() {
        return sort;
    }

    public void setSort(List<SortEntry> sort) {
        this.sort = sort;
    }
}
