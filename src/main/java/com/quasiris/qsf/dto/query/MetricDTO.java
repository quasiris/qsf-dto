package com.quasiris.qsf.dto.query;

import java.util.List;

public class MetricDTO {

    private String type;
    private String id;
    private String fieldName;
    private List<Integer> percents;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public List<Integer> getPercents() {
        return percents;
    }

    public void setPercents(List<Integer> percents) {
        this.percents = percents;
    }
}
