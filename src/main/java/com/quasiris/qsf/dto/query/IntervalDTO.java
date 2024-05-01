package com.quasiris.qsf.dto.query;

public class IntervalDTO {
    private Long minute;
    // fixed_interval calendar_interval
    private String type;

    private String comment;

    private String interval;

    private String facetKeyMapper;

    private String format;

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public Long getMinute() {
        return minute;
    }

    public void setMinute(Long minute) {
        this.minute = minute;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFacetKeyMapper() {
        return facetKeyMapper;
    }

    public void setFacetKeyMapper(String facetKeyMapper) {
        this.facetKeyMapper = facetKeyMapper;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}