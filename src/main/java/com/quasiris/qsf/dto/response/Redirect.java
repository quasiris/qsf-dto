package com.quasiris.qsf.dto.response;

import com.quasiris.qsf.dto.common.BaseDTO;

/**
 * Created by tbl on 29.03.21.
 */
public class Redirect extends BaseDTO {

    private Integer httpCode;

    private String location;

    /**
     * Getter for property 'httpCode'.
     *
     * @return Value for property 'httpCode'.
     */
    public Integer getHttpCode() {
        return httpCode;
    }

    /**
     * Setter for property 'httpCode'.
     *
     * @param httpCode Value to set for property 'httpCode'.
     */
    public void setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
    }

    /**
     * Getter for property 'location'.
     *
     * @return Value for property 'location'.
     */
    public String getLocation() {
        return location;
    }

    /**
     * Setter for property 'location'.
     *
     * @param location Value to set for property 'location'.
     */
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Redirect{" +
                "httpCode=" + httpCode +
                ", location='" + location + '\'' +
                '}';
    }
}
