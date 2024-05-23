package com.quasiris.qsf.pipeline.filter.elastic.bean;

import com.quasiris.qsf.dto.common.BaseDTO;

import java.util.Map;

/**
 * Created by mki on 04.02.18.
 */
public class Bucket extends BaseDTO {

    private String key;
    private Long doc_count;


    private Aggregation subFacet;

    private VariantCount variant_count;

    private Map<String, Object> customData;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Long getDoc_count() {
        return doc_count;
    }

    public void setDoc_count(Long doc_count) {
        this.doc_count = doc_count;
    }

    public Aggregation getSubFacet() {
        return subFacet;
    }

    public void setSubFacet(Aggregation subFacet) {
        this.subFacet = subFacet;
    }

    /**
     * Getter for property 'variant_count'.
     *
     * @return Value for property 'variant_count'.
     */
    public VariantCount getVariant_count() {
        return variant_count;
    }

    /**
     * Setter for property 'variant_count'.
     *
     * @param variant_count Value to set for property 'variant_count'.
     */
    public void setVariant_count(VariantCount variant_count) {
        this.variant_count = variant_count;
    }

    public Map<String, Object> getCustomData() {
        return customData;
    }

    public void setCustomData(Map<String, Object> customData) {
        this.customData = customData;
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "key='" + key + '\'' +
                ", doc_count=" + doc_count +
                ", subFacet=" + subFacet +
                '}';
    }
}
