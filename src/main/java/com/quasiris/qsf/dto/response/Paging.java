package com.quasiris.qsf.dto.response;

import com.quasiris.qsf.dto.common.BaseDTO;

/**
 * Created by mki on 21.01.18.
 */
public class Paging extends BaseDTO {

    private Page firstPage;

    private Page lastPage;

    private Page nextPage;
    private Page previousPage;

    private Integer pageCount;
    private Integer currentPage;

    private Integer rows;

    public Page getFirstPage() {
        return firstPage;
    }

    public void setFirstPage(Page firstPage) {
        this.firstPage = firstPage;
    }

    public Page getLastPage() {
        return lastPage;
    }

    public void setLastPage(Page lastPage) {
        this.lastPage = lastPage;
    }

    public Page getNextPage() {
        return nextPage;
    }

    public void setNextPage(Page nextPage) {
        this.nextPage = nextPage;
    }

    public Page getPreviousPage() {
        return previousPage;
    }

    public void setPreviousPage(Page previousPage) {
        this.previousPage = previousPage;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "Paging{" +
                "firstPage=" + firstPage +
                ", lastPage=" + lastPage +
                ", nextPage=" + nextPage +
                ", previousPage=" + previousPage +
                ", pageCount=" + pageCount +
                ", currentPage=" + currentPage +
                ", rows=" + rows +
                '}';
    }
}
