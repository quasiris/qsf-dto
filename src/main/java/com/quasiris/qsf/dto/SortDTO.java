package com.quasiris.qsf.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SortDTO {

    private String sort;
    private String field;
    private String direction;

    /**
     * Getter for property 'sort'.
     *
     * @return Value for property 'sort'.
     */
    public String getSort() {
        return sort;
    }

    /**
     * Setter for property 'sort'.
     *
     * @param sort Value to set for property 'sort'.
     */
    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * Getter for property 'field'.
     *
     * @return Value for property 'field'.
     */
    public String getField() {
        return field;
    }

    /**
     * Setter for property 'field'.
     *
     * @param field Value to set for property 'field'.
     */
    public void setField(String field) {
        this.field = field;
    }

    /**
     * Getter for property 'direction'.
     *
     * @return Value for property 'direction'.
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Setter for property 'direction'.
     *
     * @param direction Value to set for property 'direction'.
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }
}
