package com.quasiris.qsf.dto.common;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Http request object
 */
public class HttpRequestDTO extends BaseDTO {
    private String method;
    private String url;
    private Object body;
    private MultiMap<String, Object> params = new MultiMap<>();
    private Map<String, String> headers = new LinkedHashMap<>();
    private HttpRequestOptionsDTO options;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public MultiMap<String, Object> getParams() {
        return params;
    }

    public void setParams(MultiMap<String, Object> params) {
        this.params = params;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void Map(Map<String, String> headers) {
        this.headers = headers;
    }

    public HttpRequestOptionsDTO getOptions() {
        return options;
    }

    public void setOptions(HttpRequestOptionsDTO options) {
        this.options = options;
    }
}
