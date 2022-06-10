package com.quasiris.qsf.pipeline.filter.elastic.bean;

import com.quasiris.qsf.dto.common.BaseDTO;

/**
 * Created by mki on 04.02.18.
 */
public class VariantCount extends BaseDTO {

    private Long value;

    /**
     * Getter for property 'value'.
     *
     * @return Value for property 'value'.
     */
    public Long getValue() {
        return value;
    }

    /**
     * Setter for property 'value'.
     *
     * @param value Value to set for property 'value'.
     */
    public void setValue(Long value) {
        this.value = value;
    }
}
