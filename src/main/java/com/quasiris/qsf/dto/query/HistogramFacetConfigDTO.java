package com.quasiris.qsf.dto.query;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;

public class HistogramFacetConfigDTO {

    private String timeZone;

    private Integer minDocCount;

    private JsonNode query;

    private List<IntervalDTO> intervals;

    private List<MetricDTO> metrics;

    public List<IntervalDTO> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<IntervalDTO> intervals) {
        this.intervals = intervals;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Integer getMinDocCount() {
        return minDocCount;
    }

    public void setMinDocCount(Integer minDocCount) {
        this.minDocCount = minDocCount;
    }

    public JsonNode getQuery() {
        return query;
    }

    public void setQuery(JsonNode query) {
        this.query = query;
    }

    public List<MetricDTO> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<MetricDTO> metrics) {
        this.metrics = metrics;
    }
}
