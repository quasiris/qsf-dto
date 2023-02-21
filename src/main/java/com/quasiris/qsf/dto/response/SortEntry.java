package com.quasiris.qsf.dto.response;

import com.quasiris.qsf.dto.common.BaseDTO;

/**
 * Created by tbl on 21.02.23.
 */
public class SortEntry extends BaseDTO {

    private String id;
    private String name;

    private Boolean selected;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }
}
