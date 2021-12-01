package com.quasiris.qsf.dto.query;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchFilterDTO {


    private FilterType filterType;

    private FilterDataType filterDataType;

    private FilterOperator filterOperator;

    private String id;

    private String name;

    private List<Object> values;

    private Object minValue;

    private Object maxValue;

    private Boolean lowerExcluded;

    private Boolean upperExcluded;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Boolean getLowerIncluded() {
        return lowerExcluded != null ? !lowerExcluded : null;
    }

    public Boolean getLowerExcluded() {
        return lowerExcluded;
    }

    public void setLowerExcluded(Boolean lowerExcluded) {
        this.lowerExcluded = lowerExcluded;
    }

    public Boolean getUpperIncluded() {
        return upperExcluded != null ? !upperExcluded : null;
    }

    public Boolean getUpperExcluded() {
        return upperExcluded;
    }

    public void setUpperExcluded(Boolean upperExcluded) {
        this.upperExcluded = upperExcluded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchFilterDTO that = (SearchFilterDTO) o;
        return filterType == that.filterType && filterDataType == that.filterDataType && filterOperator == that.filterOperator && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(values, that.values) && Objects.equals(minValue, that.minValue) && Objects.equals(maxValue, that.maxValue) && Objects.equals(lowerExcluded, that.lowerExcluded) && Objects.equals(upperExcluded, that.upperExcluded);
    }

    @Override
    public int hashCode() {
        Object[] objValues = null;
        if(values != null) {
            List<String> textValues = new ArrayList<>();
            for (Object value : values) {
                String textValue = "_null_";
                if(value != null) {
                    textValue = value.toString();
                }
                textValues.add(textValue);
            }
            objValues = textValues.toArray();
            Arrays.sort(objValues);
        }

        StringBuilder builder = new StringBuilder();
        builder.append(filterType);
        builder.append(filterDataType);
        builder.append(filterOperator);
        builder.append(id);
        builder.append(name);
        builder.append(minValue);
        builder.append(maxValue);
        builder.append(lowerExcluded);
        builder.append(upperExcluded);
        if(objValues != null) {
            for (Object objValue : objValues) {
                builder.append(objValue);
            }
        }

        return builder.toString().hashCode();
    }
}
