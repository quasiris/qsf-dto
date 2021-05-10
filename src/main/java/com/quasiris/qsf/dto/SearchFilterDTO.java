package com.quasiris.qsf.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchFilterDTO {


    private FilterType filterType;

    private FilterDataType filterDataType;

    private FilterOperator filterOperator;

    private String id;

    private List<Object> values;

    private Object minValue;

    private Object maxValue;


    /**
     * Getter for property 'filterType'.
     *
     * @return Value for property 'filterType'.
     */
    public FilterType getFilterType() {
        return filterType;
    }

    /**
     * Setter for property 'filterType'.
     *
     * @param filterType Value to set for property 'filterType'.
     */
    public void setFilterType(FilterType filterType) {
        this.filterType = filterType;
    }

    /**
     * Getter for property 'filterOperator'.
     *
     * @return Value for property 'filterOperator'.
     */
    public FilterOperator getFilterOperator() {
        return filterOperator;
    }

    /**
     * Setter for property 'filterOperator'.
     *
     * @param filterOperator Value to set for property 'filterOperator'.
     */
    public void setFilterOperator(FilterOperator filterOperator) {
        this.filterOperator = filterOperator;
    }

    /**
     * Getter for property 'id'.
     *
     * @return Value for property 'id'.
     */
    public String getId() {
        return id;
    }

    /**
     * Setter for property 'id'.
     *
     * @param id Value to set for property 'id'.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for property 'values'.
     *
     * @return Value for property 'values'.
     */
    public List<Object> getValues() {
        return values;
    }

    /**
     * Setter for property 'values'.
     *
     * @param values Value to set for property 'values'.
     */
    public void setValues(List<Object> values) {
        this.values = values;
    }

    /**
     * Getter for property 'minValue'.
     *
     * @return Value for property 'minValue'.
     */
    public Object getMinValue() {
        return minValue;
    }

    /**
     * Setter for property 'minValue'.
     *
     * @param minValue Value to set for property 'minValue'.
     */
    public void setMinValue(Object minValue) {
        this.minValue = minValue;
    }

    /**
     * Getter for property 'maxValue'.
     *
     * @return Value for property 'maxValue'.
     */
    public Object getMaxValue() {
        return maxValue;
    }

    /**
     * Setter for property 'maxValue'.
     *
     * @param maxValue Value to set for property 'maxValue'.
     */
    public void setMaxValue(Object maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * Getter for property 'filterDataType'.
     *
     * @return Value for property 'filterDataType'.
     */
    public FilterDataType getFilterDataType() {
        return filterDataType;
    }

    /**
     * Setter for property 'filterDataType'.
     *
     * @param filterDataType Value to set for property 'filterDataType'.
     */
    public void setFilterDataType(FilterDataType filterDataType) {
        this.filterDataType = filterDataType;
    }
}
