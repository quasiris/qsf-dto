package com.quasiris.qsf.dto.elasticsearch;

import com.quasiris.qsf.dto.common.BaseDTO;
import java.util.HashMap;
import java.util.Map;

/**
 * Elasticsearch Document
 */
public class IndexDocument extends BaseDTO {
    private String id;
    private Map<String, Object> fields = new HashMap<>();

    public IndexDocument() {
    }

    public IndexDocument(String id) {
        this.id = id;
    }

    public IndexDocument(String id, Map<String, Object> fields) {
        this.id = id;
        this.fields = fields;
    }

    public IndexDocument(IndexDocument copy) {
        this(copy.getId(), copy.getFields());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, Object> getFields() {
        return fields;
    }

    public void setFields(Map<String, Object> fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IndexDocument)) return false;

        IndexDocument document = (IndexDocument) o;

        if (!id.equals(document.id)) return false;
        return fields.equals(document.fields);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + fields.hashCode();
        return result;
    }
}
