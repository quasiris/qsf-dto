package com.quasiris.qsf.dto.elasticsearch;

import com.quasiris.qsf.dto.common.BaseDTO;
import java.util.ArrayList;
import java.util.List;

public class AliasActions extends BaseDTO {
    private List<AliasAction> actions = new ArrayList<>();

    public List<AliasAction> getActions() {
        return actions;
    }

    public void setActions(List<AliasAction> actions) {
        this.actions = actions;
    }
}
