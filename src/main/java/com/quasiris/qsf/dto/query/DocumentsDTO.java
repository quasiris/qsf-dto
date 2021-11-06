package com.quasiris.qsf.dto.query;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentsDTO {

    private Map<String, FieldDTO> fields;

    /**
     * Getter for property 'fields'.
     *
     * @return Value for property 'fields'.
     */
    public Map<String, FieldDTO> getFields() {
        return fields;
    }

    /**
     * Setter for property 'fields'.
     *
     * @param fields Value to set for property 'fields'.
     */
    public void setFields(Map<String, FieldDTO> fields) {
        this.fields = fields;
    }
}
