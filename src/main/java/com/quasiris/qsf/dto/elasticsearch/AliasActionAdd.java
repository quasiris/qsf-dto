package com.quasiris.qsf.dto.elasticsearch;

import com.quasiris.qsf.dto.common.BaseDTO;

public class AliasActionAdd extends BaseDTO {
    private String[] aliases;
    private String[] indices;

    public String[] getAliases() {
        return aliases;
    }

    public void setAliases(String... aliases) {
        this.aliases = aliases;
    }

    public String[] getIndices() {
        return indices;
    }

    public void setIndices(String... indices) {
        this.indices = indices;
    }
}
