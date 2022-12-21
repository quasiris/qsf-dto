package com.quasiris.qsf.dto.query;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Created by tbl on 19.7.20.
 */
public enum FilterType {

    TERM("term"), RELATIVERANGE("relativerange"), HUMANDDATE("humandate"), RANGE("range"),SLIDER("slider"),TREE("tree");


    private final String code;

    FilterType(String code) {
        this.code = code;
    }

    @JsonValue
    public String getCode() {
        return code;
    }

    public boolean isRange() {
        return RANGE == this;
    }

    public boolean isRelativeRange() {
        return RELATIVERANGE == this;
    }

    public boolean isTerm() {
        return TERM == this;
    }

    public boolean isHumanDate() {
        return HUMANDDATE == this;
    }

}
