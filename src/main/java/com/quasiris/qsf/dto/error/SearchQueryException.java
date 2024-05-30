package com.quasiris.qsf.dto.error;

public class SearchQueryException extends IllegalArgumentException {

    public SearchQueryException() {
    }

    public SearchQueryException(String s) {
        super(s);
    }

    public SearchQueryException(String message, Throwable cause) {
        super(message, cause);
    }

    public SearchQueryException(Throwable cause) {
        super(cause);
    }
}
