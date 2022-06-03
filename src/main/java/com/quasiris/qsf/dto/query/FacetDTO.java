package com.quasiris.qsf.dto.query;

import com.quasiris.qsf.dto.common.BaseDTO;

import java.util.List;

public class FacetDTO extends BaseDTO {

    private Boolean enabled;

    private List<FacetsDTO> facets;

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

    /**
     * Getter for property 'facets'.
     *
     * @return Value for property 'facets'.
     */
    public List<FacetsDTO> getFacets() {
        return facets;
    }

    /**
     * Setter for property 'facets'.
     *
     * @param facets Value to set for property 'facets'.
     */
    public void setFacets(List<FacetsDTO> facets) {
        this.facets = facets;
    }
}
