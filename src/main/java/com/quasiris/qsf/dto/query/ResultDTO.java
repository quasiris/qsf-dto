package com.quasiris.qsf.dto.query;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultDTO {

    private Map<String, DocumentDTO> documents;

    private List<FacetDTO> facets;
    private List<SliderDTO> sliders;

    /**
     * Getter for property 'documents'.
     *
     * @return Value for property 'documents'.
     */
    public Map<String, DocumentDTO> getDocuments() {
        return documents;
    }

    /**
     * Setter for property 'documents'.
     *
     * @param documents Value to set for property 'documents'.
     */
    public void setDocuments(Map<String, DocumentDTO> documents) {
        this.documents = documents;
    }

    /**
     * Getter for property 'facets'.
     *
     * @return Value for property 'facets'.
     */
    public List<FacetDTO> getFacets() {
        return facets;
    }

    /**
     * Setter for property 'facets'.
     *
     * @param facets Value to set for property 'facets'.
     */
    public void setFacets(List<FacetDTO> facets) {
        this.facets = facets;
    }

    /**
     * Getter for property 'sliders'.
     *
     * @return Value for property 'sliders'.
     */
    public List<SliderDTO> getSliders() {
        return sliders;
    }

    /**
     * Setter for property 'sliders'.
     *
     * @param sliders Value to set for property 'sliders'.
     */
    public void setSliders(List<SliderDTO> sliders) {
        this.sliders = sliders;
    }

}
