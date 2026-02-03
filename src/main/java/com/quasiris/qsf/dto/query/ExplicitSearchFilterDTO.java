package com.quasiris.qsf.dto.query;

import java.util.List;
import java.util.Set;

/**
 * OpenAPI-friendly filter definition.
 * Used as value in a Map where the key is the filter id/name.
 */
public class ExplicitSearchFilterDTO {

    private FilterType filterType;

    private FilterDataType filterDataType;

    private FilterOperator filterOperator;

    private List<Object> values;

    private Object minValue;

    private Object maxValue;

    private Boolean lowerExcluded;

    private Boolean upperExcluded;

    private Set<String> ctrl;

    public FilterType getFilterType() {
        return filterType;
    }

    public void setFilterType(FilterType filterType) {
        this.filterType = filterType;
    }

    public FilterDataType getFilterDataType() {
        return filterDataType;
    }

    public void setFilterDataType(FilterDataType filterDataType) {
        this.filterDataType = filterDataType;
    }

    public FilterOperator getFilterOperator() {
        return filterOperator;
    }

    public void setFilterOperator(FilterOperator filterOperator) {
        this.filterOperator = filterOperator;
    }

    public List<Object> getValues() {
        return values;
    }

    public void setValues(List<Object> values) {
        this.values = values;
    }

    public Object getMinValue() {
        return minValue;
    }

    public void setMinValue(Object minValue) {
        this.minValue = minValue;
    }

    public Object getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Object maxValue) {
        this.maxValue = maxValue;
    }

    public Boolean getLowerExcluded() {
        return lowerExcluded;
    }

    public void setLowerExcluded(Boolean lowerExcluded) {
        this.lowerExcluded = lowerExcluded;
    }

    public Boolean getUpperExcluded() {
        return upperExcluded;
    }

    public void setUpperExcluded(Boolean upperExcluded) {
        this.upperExcluded = upperExcluded;
    }

    public Set<String> getCtrl() {
        return ctrl;
    }

    public void setCtrl(Set<String> ctrl) {
        this.ctrl = ctrl;
    }

    /**
     * Converts this explicit filter to a SearchFilterDTO.
     *
     * @param id the filter id (from the map key)
     * @return the converted SearchFilterDTO
     */
    public SearchFilterDTO toSearchFilterDTO(String id) {
        SearchFilterDTO dto = new SearchFilterDTO();
        dto.setId(id);
        dto.setName(id);
        dto.setFilterType(filterType);
        dto.setFilterDataType(filterDataType);
        dto.setFilterOperator(filterOperator);
        dto.setValues(values);
        dto.setMinValue(minValue);
        dto.setMaxValue(maxValue);
        dto.setLowerExcluded(lowerExcluded);
        dto.setUpperExcluded(upperExcluded);
        dto.setCtrl(ctrl);
        return dto;
    }
}
