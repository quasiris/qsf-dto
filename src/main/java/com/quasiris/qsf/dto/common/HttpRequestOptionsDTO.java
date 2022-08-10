package com.quasiris.qsf.dto.common;

/**
 * Request options with probably handled by the http client
 */
public class HttpRequestOptionsDTO extends BaseDTO {
    private boolean disableSslCheck;
    private int numRetries;
    private int timeout;

    public boolean isDisableSslCheck() {
        return disableSslCheck;
    }

    public void setDisableSslCheck(boolean disableSslCheck) {
        this.disableSslCheck = disableSslCheck;
    }

    public int getNumRetries() {
        return numRetries;
    }

    public void setNumRetries(int numRetries) {
        this.numRetries = numRetries;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
}
