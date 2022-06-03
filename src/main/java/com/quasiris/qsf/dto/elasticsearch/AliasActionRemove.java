package com.quasiris.qsf.dto.elasticsearch;

import com.quasiris.qsf.dto.common.BaseDTO;

public class AliasActionRemove extends BaseDTO {
    private String[] aliases;
    private String[] indices;

//    private boolean mustExist; // Bug in elastic 7.10 issue-62642

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

//    @JsonProperty("must_exist")
//    public boolean isMustExist() {
//        return mustExist;
//    }
//
//    public void setMustExist(boolean mustExist) {
//        this.mustExist = mustExist;
//    }
}
