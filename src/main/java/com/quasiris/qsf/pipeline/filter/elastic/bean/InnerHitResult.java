package com.quasiris.qsf.pipeline.filter.elastic.bean;

import com.quasiris.qsf.dto.common.BaseDTO;

public class InnerHitResult extends BaseDTO {
    private Hits hits;

    public Hits getHits() {
        return hits;
    }

    public void setHits(Hits hits) {
        this.hits = hits;
    }

    @Override
    public String toString() {
        return "Hits{" +
                ", hits=" + hits +
                '}';
    }
}
