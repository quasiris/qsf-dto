package com.quasiris.qsf.dto.response;

import com.quasiris.qsf.dto.common.BaseDTO;

import java.util.Map;

/**
 * Created by mki on 12.11.17.
 */
public class FacetValue extends BaseDTO {

    public FacetValue() {
    }

    public FacetValue(String value, Long count) {
        this.value = value;
        this.count = count;
    }

    private String value;

    private Long count;

    private Object filter;

    private Boolean selected;

    private Facet children;

    private Integer position;

    private Map<String, Object> properties;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Object getFilter() {
        return filter;
    }

    public void setFilter(Object filter) {
        this.filter = filter;
    }

    /**
     * Getter for property 'children'.
     *
     * @return Value for property 'children'.
     */
    public Facet getChildren() {
        return children;
    }

    /**
     * Setter for property 'children'.
     *
     * @param children Value to set for property 'children'.
     */
    public void setChildren(Facet children) {
        this.children = children;
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

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "FacetValue{" +
                "value='" + value + '\'' +
                ", count=" + count +
                ", filter='" + filter + '\'' +
                ", children=" + children +
                '}';
    }
}
