package com.quasiris.qsf.dto.response;

import com.quasiris.qsf.dto.common.BaseDTO;

import java.util.Map;

public class Widget extends BaseDTO {

    private String id;

    private Map<String, Object> data;

    private Integer start;
    private Integer end;


    // jsonPath to the data
    private String dataSource;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }
}
