package com.quasiris.qsf.dto.elasticsearch;

import com.quasiris.qsf.dto.common.BaseDTO;
import java.util.List;
import java.util.Map;

/**
 * Bulk response
 */
public class BulkResponse extends BaseDTO {
    private Integer took;
    private Boolean errors;
    private List<Map> items;

    public Integer getTook() {
        return took;
    }

    public void setTook(Integer took) {
        this.took = took;
    }

    public Boolean getErrors() {
        return errors;
    }

    public void setErrors(Boolean errors) {
        this.errors = errors;
    }

    public List<Map> getItems() {
        return items;
    }

    public void setItems(List<Map> items) {
        this.items = items;
    }
}
