package com.quasiris.qsf.dto.query;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Date;

/**
 * Created by tbl on 19.7.20.
 */
public enum FilterDataType {

    STRING("string", String.class),DATE("date", Date.class), NUMBER("number", Number.class);

    private final String code;

    private final Class clazz;

    FilterDataType(String code, Class clazz) {
        this.code = code;
        this.clazz = clazz;
    }
    @JsonValue
    public String getCode() {
        return code;
    }

    /**
     * Getter for property 'clazz'.
     *
     * @return Value for property 'clazz'.
     */
    public Class getClazz() {
        return clazz;
    }

    public boolean isString() {
        return this.equals(STRING);
    }

    public boolean isDate() {
        return this.equals(DATE);
    }

    public boolean isNumber() {
        return this.equals(NUMBER);
    }
}

