package com.quasiris.qsf.pipeline.filter.elastic.bean;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.quasiris.qsf.dto.common.BaseDTO;

/**
 * Created by mki on 19.11.17.
 */
public class ElasticResult extends BaseDTO {

    private String _scroll_id;
    private long took;

    private Hits hits;

    @JsonDeserialize(using = AggregationsDeserializer.class)
    private Aggregation aggregations;

    public long getTook() {
        return took;
    }

    public void setTook(long took) {
        this.took = took;
    }

    public Hits getHits() {
        return hits;
    }

    public void setHits(Hits hits) {
        this.hits = hits;
    }

    /**
     * Getter for property 'aggregations'.
     *
     * @return Value for property 'aggregations'.
     */
    public Aggregation getAggregations() {
        return aggregations;
    }

    /**
     * Setter for property 'aggregations'.
     *
     * @param aggregations Value to set for property 'aggregations'.
     */
    public void setAggregations(Aggregation aggregations) {
        this.aggregations = aggregations;
    }

    public String get_scroll_id() {
        return _scroll_id;
    }

    public void set_scroll_id(String _scroll_id) {
        this._scroll_id = _scroll_id;
    }

    @Override
    public String toString() {
        return "ElasticResult{" +
                "took=" + took +
                ", hits=" + hits +
                ", aggregations=" + aggregations +
                '}';
    }
}
