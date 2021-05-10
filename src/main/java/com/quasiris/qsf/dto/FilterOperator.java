package com.quasiris.qsf.dto;

/**
 * Created by tbl on 19.7.20.
 */
public enum FilterOperator {

    OR("or"),AND("and"), NOT("not");


    private final String code;

    FilterOperator(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
