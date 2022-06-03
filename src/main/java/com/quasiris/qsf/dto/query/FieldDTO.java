package com.quasiris.qsf.dto.query;

import com.quasiris.qsf.dto.common.BaseDTO;

public class FieldDTO extends BaseDTO {

    private Integer length;
    private String lengthPunctuation;
    private String source;
    private String dataType;
    private String format;
    private String highlighting;
    private String highlightingTag;
    private Boolean removeHtmlTags;

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

    public String getLengthPunctuation() {
        return lengthPunctuation;
    }

    public void setLengthPunctuation(String lengthPunctuation) {
        this.lengthPunctuation = lengthPunctuation;
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

    /**
     * Getter for property 'source'.
     *
     * @return Value for property 'source'.
     */
    public String getSource() {
        return source;
    }

    /**
     * Setter for property 'source'.
     *
     * @param source Value to set for property 'source'.
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * Getter for property 'highlightingTag'.
     *
     * @return Value for property 'highlightingTag'.
     */
    public String getHighlightingTag() {
        return highlightingTag;
    }

    /**
     * Setter for property 'highlightingTag'.
     *
     * @param highlightingTag Value to set for property 'highlightingTag'.
     */
    public void setHighlightingTag(String highlightingTag) {
        this.highlightingTag = highlightingTag;
    }

    /**
     * Getter for property 'removeHtmlTags'.
     *
     * @return Value for property 'removeHtmlTags'.
     */
    public Boolean getRemoveHtmlTags() {
        return removeHtmlTags;
    }

    /**
     * Setter for property 'removeHtmlTags'.
     *
     * @param removeHtmlTags Value to set for property 'removeHtmlTags'.
     */
    public void setRemoveHtmlTags(Boolean removeHtmlTags) {
        this.removeHtmlTags = removeHtmlTags;
    }
}
