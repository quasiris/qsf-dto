package com.quasiris.qsf.dto.response;

import com.quasiris.qsf.dto.common.BaseDTO;

import java.util.Date;

/**
 * Created by tbl on 29.05.19.
 */
public class MonitoringResponse extends BaseDTO {


    private Integer statusCode;
    private SimpleSearchResponse result;

    private long time;

    private Date currentTime;

    private String status;


    /**
     * Getter for property 'statusCode'.
     *
     * @return Value for property 'statusCode'.
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * Setter for property 'statusCode'.
     *
     * @param statusCode Value to set for property 'statusCode'.
     */
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Getter for property 'result'.
     *
     * @return Value for property 'result'.
     */
    public SimpleSearchResponse getResult() {
        return result;
    }

    /**
     * Setter for property 'result'.
     *
     * @param result Value to set for property 'result'.
     */
    public void setResult(SimpleSearchResponse result) {
        this.result = result;
    }

    /**
     * Getter for property 'time'.
     *
     * @return Value for property 'time'.
     */
    public long getTime() {
        return time;
    }

    /**
     * Setter for property 'time'.
     *
     * @param time Value to set for property 'time'.
     */
    public void setTime(long time) {
        this.time = time;
    }

    /**
     * Getter for property 'currentTime'.
     *
     * @return Value for property 'currentTime'.
     */
    public Date getCurrentTime() {
        return currentTime;
    }

    /**
     * Setter for property 'currentTime'.
     *
     * @param currentTime Value to set for property 'currentTime'.
     */
    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    /**
     * Getter for property 'status'.
     *
     * @return Value for property 'status'.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Setter for property 'status'.
     *
     * @param status Value to set for property 'status'.
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
