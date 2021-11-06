package com.quasiris.qsf.dto.query;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldDTO {

    private Integer length;
    private String dataType;
    private String format;
    private String highlighting;

    /**
     * Getter for property 'length'.
     *
     * @return Value for property 'length'.
     */
    public Integer getLength() {
        return length;
    }

    /**
     * Setter for property 'length'.
     *
     * @param length Value to set for property 'length'.
     */
    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * Getter for property 'dataType'.
     *
     * @return Value for property 'dataType'.
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Setter for property 'dataType'.
     *
     * @param dataType Value to set for property 'dataType'.
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * Getter for property 'format'.
     *
     * @return Value for property 'format'.
     */
    public String getFormat() {
        return format;
    }

    /**
     * Setter for property 'format'.
     *
     * @param format Value to set for property 'format'.
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * Getter for property 'highlighting'.
     *
     * @return Value for property 'highlighting'.
     */
    public String getHighlighting() {
        return highlighting;
    }

    /**
     * Setter for property 'highlighting'.
     *
     * @param highlighting Value to set for property 'highlighting'.
     */
    public void setHighlighting(String highlighting) {
        this.highlighting = highlighting;
    }
}
