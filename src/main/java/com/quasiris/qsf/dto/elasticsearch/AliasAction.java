package com.quasiris.qsf.dto.elasticsearch;

import com.quasiris.qsf.dto.common.BaseDTO;

public class AliasAction extends BaseDTO {
    AliasActionAdd add;
    AliasActionRemove remove;

    public AliasActionAdd getAdd() {
        return add;
    }

    public void setAdd(AliasActionAdd add) {
        this.add = add;
    }

    public AliasActionRemove getRemove() {
        return remove;
    }

    public void setRemove(AliasActionRemove remove) {
        this.remove = remove;
    }
}
