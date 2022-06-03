package com.quasiris.qsf.dto.query;

import com.quasiris.qsf.dto.common.BaseDTO;

import java.util.Map;

public class DocumentsDTO extends BaseDTO {

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
