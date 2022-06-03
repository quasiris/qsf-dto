package com.quasiris.qsf.dto.response;

import com.quasiris.qsf.dto.common.BaseDTO;

/**
 * Created by mki on 21.01.18.
 */
public class Page extends BaseDTO {

    private Boolean currentPage;

    private Integer number;

    private String parameter;

    public Boolean getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Boolean currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    @Override
    public String toString() {
        return "Page{" +
                "currentPage=" + currentPage +
                ", number=" + number +
                ", parameter='" + parameter + '\'' +
                '}';
    }
}
