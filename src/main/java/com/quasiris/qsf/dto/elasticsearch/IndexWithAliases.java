package com.quasiris.qsf.dto.elasticsearch;

import com.quasiris.qsf.dto.common.BaseDTO;
import java.util.List;

public class IndexWithAliases extends BaseDTO {

    private String indexName;
    private List<String> aliases;

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public List<String> getAliases() {
        return aliases;
    }

    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }
}
