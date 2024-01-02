package com.quasiris.qsf.dto.response;

import com.quasiris.qsf.dto.common.BaseDTO;
import java.util.List;
import java.util.Map;

/**
 * Created by mki on 12.11.17.
 */
public class Facet extends BaseDTO {

    private String name;

    private String id;

    private String type;

    private String filterName;

    private Long count;

    private Long resultCount;

    private Boolean selected;

    private Map<String, Object> properties;

    private List<FacetValue> values;

    private Double minValue;
    private Double maxValue;
    private Double minRange;
    private Double maxRange;

    private String unit;

    private List<Facet> children;





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<FacetValue> getValues() {
        return values;
    }

    public void setValues(List<FacetValue> values) {
        this.values = values;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getResultCount() {
        return resultCount;
    }

    public void setResultCount(Long resultCount) {
        this.resultCount = resultCount;
    }

    public String getFilterName() {
        return filterName;
    }

    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    /**
     * Getter for property 'selected'.
     *
     * @return Value for property 'selected'.
     */
    public Boolean getSelected() {
        return selected;
    }

    /**
     * Setter for property 'selected'.
     *
     * @param selected Value to set for property 'selected'.
     */
    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    /**
     * Getter for property 'type'.
     *
     * @return Value for property 'type'.
     */
    public String getType() {
        return type;
    }

    /**
     * Setter for property 'type'.
     *
     * @param type Value to set for property 'type'.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for property 'minValue'.
     *
     * @return Value for property 'minValue'.
     */
    public Double getMinValue() {
        return minValue;
    }

    /**
     * Setter for property 'minValue'.
     *
     * @param minValue Value to set for property 'minValue'.
     */
    public void setMinValue(Double minValue) {
        this.minValue = minValue;
    }

    /**
     * Getter for property 'maxValue'.
     *
     * @return Value for property 'maxValue'.
     */
    public Double getMaxValue() {
        return maxValue;
    }

    /**
     * Setter for property 'maxValue'.
     *
     * @param maxValue Value to set for property 'maxValue'.
     */
    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * Getter for property 'minRange'.
     *
     * @return Value for property 'minRange'.
     */
    public Double getMinRange() {
        return minRange;
    }

    /**
     * Setter for property 'minRange'.
     *
     * @param minRange Value to set for property 'minRange'.
     */
    public void setMinRange(Double minRange) {
        this.minRange = minRange;
    }

    /**
     * Getter for property 'maxRange'.
     *
     * @return Value for property 'maxRange'.
     */
    public Double getMaxRange() {
        return maxRange;
    }

    /**
     * Setter for property 'maxRange'.
     *
     * @param maxRange Value to set for property 'maxRange'.
     */
    public void setMaxRange(Double maxRange) {
        this.maxRange = maxRange;
    }

    /**
     * Getter for property 'unit'.
     *
     * @return Value for property 'unit'.
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Setter for property 'unit'.
     *
     * @param unit Value to set for property 'unit'.
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public FacetValue getFacetValueByValue(String value) {
        for(FacetValue facetValue : getValues()) {
            if(facetValue.getValue().equals(value)) {
                return facetValue;
            }
        }
        return null;
    }

    public Long getFacetCountByValue(String value) {
        FacetValue facetValue = getFacetValueByValue(value);
        if(facetValue == null) {
            return 0L;
        }
        return facetValue.getCount();
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }


    public List<Facet> getChildren() {
        return children;
    }

    public void setChildren(List<Facet> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Facet{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", filterName='" + filterName + '\'' +
                ", count=" + count +
                ", resultCount=" + resultCount +
                ", values=" + values +
                '}';
    }
}
