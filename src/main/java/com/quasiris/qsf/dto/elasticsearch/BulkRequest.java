package com.quasiris.qsf.dto.elasticsearch;

import com.quasiris.qsf.dto.common.BaseDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Bulk request
 */
public class BulkRequest extends BaseDTO {
    private List<IndexAction> actions = new ArrayList<>();
    private Integer timeout;

    public BulkRequest() {
    }

    public BulkRequest(List<IndexAction> actions) {
        this.actions = actions;
    }

    public BulkRequest(List<IndexAction> actions, Integer timeout) {
        this.actions = actions;
        this.timeout = timeout;
    }

    public List<IndexAction> getActions() {
        return actions;
    }

    public void setActions(List<IndexAction> actions) {
        this.actions = actions;
    }

    /**
     * Timeout in seconds
     * @return timeout or null if not set
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }
}
