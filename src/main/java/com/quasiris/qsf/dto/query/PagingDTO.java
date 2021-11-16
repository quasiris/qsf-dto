package com.quasiris.qsf.dto.query;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PagingDTO {

    private Boolean enabled;

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
}
