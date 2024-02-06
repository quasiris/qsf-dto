package com.quasiris.qsf.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.quasiris.qsf.dto.common.BaseDTO;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mki on 11.11.16.
 */
public class SearchResponse extends BaseDTO {

    private Integer statusCode = 200;

    private Map<String, SearchResult> result = new HashMap<>();

    private Map<String, List<Widget>> widgets;

    private long time;

    private Date currentTime = new Date();

    private Request request;

    private String requestId;

    private DidYouMeanResult didYouMeanResult;

    /**
     * Getter for property 'didYouMeanResult'.
     *
     * @return Value for property 'didYouMeanResult'.
     */
    public DidYouMeanResult getDidYouMeanResult() {
        return didYouMeanResult;
    }

    /**
     * Setter for property 'didYouMeanResult'.
     *
     * @param didYouMeanResult Value to set for property 'didYouMeanResult'.
     */
    public void setDidYouMeanResult(DidYouMeanResult didYouMeanResult) {
        this.didYouMeanResult = didYouMeanResult;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Map<String, SearchResult> getResult() {
        return result;
    }

    public void setResult(Map<String, SearchResult> result) {
        this.result = result;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ", timezone = "GMT")
    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    /**
     * Getter for property 'requestId'.
     *
     * @return Value for property 'requestId'.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Setter for property 'requestId'.
     *
     * @param requestId Value to set for property 'requestId'.
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
