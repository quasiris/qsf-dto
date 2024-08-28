package com.quasiris.qsf.dto.config;

import java.util.Map;

public class ColorPickerFacetConfigDTO {

    private Map<String, String> colorMappings;

    public Map<String, String> getColorMappings() {
        return colorMappings;
    }

    public void setColorMappings(Map<String, String> colorMappings) {
        this.colorMappings = colorMappings;
    }
}
