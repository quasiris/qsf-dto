package com.quasiris.qsf.dto.query;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Utility class to transform explicit search filters (Map-based) to the generic SearchFilterDTO list.
 */
public class ExplicitSearchFilterMapper {

    /**
     * Transforms a map of explicit filters to a list of SearchFilterDTO.
     *
     * @param explicitFilters the map where key is filter id and value is the filter definition
     * @return list of SearchFilterDTO, or empty list if input is null
     */
    public static List<SearchFilterDTO> toSearchFilters(Map<String, ExplicitSearchFilterDTO> explicitFilters) {
        List<SearchFilterDTO> result = new ArrayList<>();
        if (explicitFilters == null) {
            return result;
        }
        for (Map.Entry<String, ExplicitSearchFilterDTO> entry : explicitFilters.entrySet()) {
            String id = entry.getKey();
            ExplicitSearchFilterDTO explicit = entry.getValue();
            if (explicit != null) {
                result.add(explicit.toSearchFilterDTO(id));
            }
        }
        return result;
    }

    /**
     * Merges explicit filters into an existing list of base search filters.
     * The explicit filters are converted and appended to the existing list.
     *
     * @param existingFilters the existing list of filters (can be null)
     * @param explicitFilters the map of explicit filters (can be null)
     * @return merged list of filters
     */
    public static List<BaseSearchFilterDTO> merge(
            List<BaseSearchFilterDTO> existingFilters,
            Map<String, ExplicitSearchFilterDTO> explicitFilters) {

        List<BaseSearchFilterDTO> result = new ArrayList<>();
        if (existingFilters != null) {
            result.addAll(existingFilters);
        }
        if (explicitFilters != null) {
            result.addAll(toSearchFilters(explicitFilters));
        }
        return result;
    }
}
