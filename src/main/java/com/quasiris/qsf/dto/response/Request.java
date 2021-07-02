package com.quasiris.qsf.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Map;

/**
 * Created by mki on 19.11.17.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Request {

    public Request() {
    }

    private String url;

    private String path;

    private String query;

    private String method;


    private Map<String, String[]> parameters;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Map<String, String[]> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String[]> parameters) {
        this.parameters = parameters;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public String toString() {
        return "Request{" +
                "url='" + url + '\'' +
                ", path='" + path + '\'' +
                ", query='" + query + '\'' +
                ", method='" + method + '\'' +
                ", parameters=" + parameters +
                '}';
    }
}
