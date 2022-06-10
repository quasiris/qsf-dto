package com.quasiris.qsf.pipeline.filter.elastic.bean;

import com.quasiris.qsf.dto.common.BaseDTO;

public class InnerHitNested extends BaseDTO {

    private String field;
    private Integer offset;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return "Hit{" +
                "field='" + field +
                ", offset='" + offset +
                '}';
    }
}
