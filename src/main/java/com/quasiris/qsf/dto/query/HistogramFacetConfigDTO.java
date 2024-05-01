package com.quasiris.qsf.dto.query;

import java.util.List;

public class HistogramFacetConfigDTO {

    private List<IntervalDTO> intervals;

    public List<IntervalDTO> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<IntervalDTO> intervals) {
        this.intervals = intervals;
    }
}
