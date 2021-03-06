package com.quasiris.qsf.dto.response;

import com.quasiris.qsf.dto.common.BaseDTO;

/**
 * Created by mki on 19.11.17.
 */
public class Parameter extends BaseDTO {

    private String name;

    private String value;

    public Parameter(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Parameter{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
