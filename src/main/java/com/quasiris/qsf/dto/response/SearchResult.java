package com.quasiris.qsf.dto.response;

import com.quasiris.qsf.dto.common.BaseDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mki on 11.11.16.
 */
public class SearchResult extends BaseDTO {

    private Object rawResponse;

    /**
     * use status object
     */
    @Deprecated
    private Integer statusCode;

    private String name;

    /**
     * use status object
     */
    @Deprecated
    private String statusMessage;

    private List<Document> documents;

    private Long time;

    private String debug;

    private Long total;

    private Float maxScore;

    private List<Facet> facets;
    private List<Slider> sliders;

    private Integer facetCount;


    private Paging paging;

    private Sort sort;

    private Redirect redirect;

    private Map<String, Object> context;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    /**
     * TODO use status object
     * @return status message
     */
    @Deprecated
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * TODO use status object
     * @param statusMessage param
     */
    @Deprecated
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public Object getRawResponse() {
        return rawResponse;
    }

    public void setRawResponse(Object rawResponse) {
        this.rawResponse = rawResponse;
    }

    /**
     * TODO use status object
     * @param statusCode param
     */
    @Deprecated
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * TODO use status object
     * @return status code
     */
    @Deprecated
    public Integer getStatusCode() {
        return statusCode;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getDebug() {
        return debug;
    }

    public void setDebug(String debug) {
        this.debug = debug;
    }

    public void debug(String message) {
        if(this.debug == null) {
            this.debug = message;
            return;
        }

        this.debug = " " + message;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Float getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(Float maxScore) {
        this.maxScore = maxScore;
    }

    public List<Facet> getFacets() {
        return facets;
    }

    public void setFacets(List<Facet> facets) {
        this.facets = facets;
    }


    public void addDocument(Document document) {
        if(this.documents == null) {
            this.documents = new ArrayList<>();
        }
        getDocuments().add(document);
    }

    public void addFacet(Facet facet) {
        if(this.facets == null) {
            this.facets = new ArrayList<>();
        }
        getFacets().add(facet);
    }

    public void addSlider(Slider slider) {
        if(this.sliders == null) {
            this.sliders = new ArrayList<>();
        }
        getSliders().add(slider);
    }

    /**
     * Getter for property 'sliders'.
     *
     * @return Value for property 'sliders'.
     */
    public List<Slider> getSliders() {
        return sliders;
    }

    /**
     * Setter for property 'sliders'.
     *
     * @param sliders Value to set for property 'sliders'.
     */
    public void setSliders(List<Slider> sliders) {
        this.sliders = sliders;
    }

    public Facet getFacetById(String id) {
        if(getFacets() == null) {
            return null;
        }
        for(Facet facet : getFacets()) {
            if(id.equals(facet.getId())) {
                return facet;
            }
        }
        return null;
    }


    public Slider getSliderById(String id) {
        if(getSliders() == null) {
            return null;
        }
        for(Slider slider : getSliders()) {
            if(id.equals(slider.getId())) {
                return slider;
            }
        }
        return null;
    }

    public Integer getFacetCount() {
        return facetCount;
    }

    public void setFacetCount(Integer facetCount) {
        this.facetCount = facetCount;
    }


    public void initDocuments() {
        this.documents = new ArrayList<>();
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    public <T> T getContext(String name, Class<T> clazz) {
        return (T) context.get(name);
    }

    public Map<String, Object> getContext() {
        return context;
    }

    public void putContext(String name, Object value) {
        if(context == null) {
            context = new HashMap<>();
        }
        context.put(name, value);
    }

    /**
     * Getter for property 'redirect'.
     *
     * @return Value for property 'redirect'.
     */
    public Redirect getRedirect() {
        return redirect;
    }

    /**
     * Setter for property 'redirect'.
     *
     * @param redirect Value to set for property 'redirect'.
     */
    public void setRedirect(Redirect redirect) {
        this.redirect = redirect;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "SearchResult{" +
                "rawResponse=" + rawResponse +
                ", statusCode=" + statusCode +
                ", name='" + name + '\'' +
                ", statusMessage='" + statusMessage + '\'' +
                ", documents=" + documents +
                ", time=" + time +
                ", debug='" + debug + '\'' +
                ", total=" + total +
                ", maxScore=" + maxScore +
                ", facets=" + facets +
                ", sliders=" + sliders +
                ", facetCount=" + facetCount +
                ", paging=" + paging +
                ", redirect=" + redirect +
                ", context=" + context +
                '}';
    }
}
