package com.quasiris.qsf.dto.query;

import com.quasiris.qsf.dto.common.BaseDTO;

import java.util.Map;

public class FacetDTO extends BaseDTO {

    private Boolean enabled;

    private Map<String, FacetsDTO> facets;

    private FacetCategoryDTO facetCategory;

    /**
     * Getter for property 'enabled'.
     *
     * @return Value for property 'enabled'.
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Setter for property 'enabled'.
     *
     * @param enabled Value to set for property 'enabled'.
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Map<String, FacetsDTO> getFacets() {
        return facets;
    }

    public void setFacets(Map<String, FacetsDTO> facets) {
        this.facets = facets;
    }

    public FacetCategoryDTO getFacetCategory() {
        return facetCategory;
    }

    public void setFacetCategory(FacetCategoryDTO facetCategory) {
        this.facetCategory = facetCategory;
    }
}
