package com.quasiris.qsf.dto.query;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchQueryDTO {

    private String q;


    private Integer page;

    private Integer rows;

    private String requestId;

    private String requestOrigin;

    private SortDTO sort;

    private Boolean tracking;

    private List<String> trackingTags;

    private List<SearchFilterDTO> searchFilters;


    /**
     * Getter for property 'q'.
     *
     * @return Value for property 'q'.
     */
    public String getQ() {
        return q;
    }

    /**
     * Setter for property 'q'.
     *
     * @param q Value to set for property 'q'.
     */
    public void setQ(String q) {
        this.q = q;
    }

    /**
     * Getter for property 'page'.
     *
     * @return Value for property 'page'.
     */
    public Integer getPage() {
        return page;
    }

    /**
     * Setter for property 'page'.
     *
     * @param page Value to set for property 'page'.
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * Getter for property 'rows'.
     *
     * @return Value for property 'rows'.
     */
    public Integer getRows() {
        return rows;
    }

    /**
     * Setter for property 'rows'.
     *
     * @param rows Value to set for property 'rows'.
     */
    public void setRows(Integer rows) {
        this.rows = rows;
    }

    /**
     * Getter for property 'requestId'.
     *
     * @return Value for property 'requestId'.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Setter for property 'requestId'.
     *
     * @param requestId Value to set for property 'requestId'.
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Getter for property 'requestOrigin'.
     *
     * @return Value for property 'requestOrigin'.
     */
    public String getRequestOrigin() {
        return requestOrigin;
    }

    /**
     * Setter for property 'requestOrigin'.
     *
     * @param requestOrigin Value to set for property 'requestOrigin'.
     */
    public void setRequestOrigin(String requestOrigin) {
        this.requestOrigin = requestOrigin;
    }

    /**
     * Getter for property 'sort'.
     *
     * @return Value for property 'sort'.
     */
    public SortDTO getSort() {
        return sort;
    }

    /**
     * Setter for property 'sort'.
     *
     * @param sort Value to set for property 'sort'.
     */
    public void setSort(SortDTO sort) {
        this.sort = sort;
    }

    /**
     * Getter for property 'tracking'.
     *
     * @return Value for property 'tracking'.
     */
    public Boolean getTracking() {
        return tracking;
    }

    /**
     * Setter for property 'tracking'.
     *
     * @param tracking Value to set for property 'tracking'.
     */
    public void setTracking(Boolean tracking) {
        this.tracking = tracking;
    }

    /**
     * Getter for property 'searchFilters'.
     *
     * @return Value for property 'searchFilters'.
     */
    public List<SearchFilterDTO> getSearchFilters() {
        return searchFilters;
    }

    /**
     * Setter for property 'searchFilters'.
     *
     * @param searchFilters Value to set for property 'searchFilters'.
     */
    public void setSearchFilters(List<SearchFilterDTO> searchFilters) {
        this.searchFilters = searchFilters;
    }

    /**
     * Getter for property 'trackingTags'.
     *
     * @return Value for property 'trackingTags'.
     */
    public List<String> getTrackingTags() {
        return trackingTags;
    }

    /**
     * Setter for property 'trackingTags'.
     *
     * @param trackingTags Value to set for property 'trackingTags'.
     */
    public void setTrackingTags(List<String> trackingTags) {
        this.trackingTags = trackingTags;
    }
}
