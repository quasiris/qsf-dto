package com.quasiris.qsf.dto.query;

import com.quasiris.qsf.dto.common.BaseDTO;

public class SpellcheckDTO extends BaseDTO {

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
