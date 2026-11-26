package com.quasiris.qsf.dto.error;

/**
 * Invalid geo search input (geo filter, distance sort). Results in HTTP 400 with an error code.
 */
public class GeoSearchException extends SearchQueryException {

    public static final String POINT_INVALID = "search.geo.point-invalid";
    public static final String POINT_OUT_OF_RANGE = "search.geo.point-out-of-range";
    public static final String POINT_MISSING = "search.geo.point-missing";
    public static final String RADIUS_INVALID = "search.geo.radius-invalid";
    public static final String RADIUS_TOO_LARGE = "search.geo.radius-too-large";
    public static final String FIELD_INVALID = "search.geo.field-invalid";

    private final String errorCode;

    public GeoSearchException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
