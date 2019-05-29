package com.github.toutiao.sdk.support;

public class ToutiaoRestException extends RuntimeException {


    private int responsecode;

    private Error details;

    public ToutiaoRestException(String message) {
        super(message);
    }

    public ToutiaoRestException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public ToutiaoRestException(Throwable throwable) {
        super(throwable);
    }

    public int getResponsecode() {
        return responsecode;
    }

    public void setResponsecode(int responsecode) {
        this.responsecode = responsecode;
    }

    public Error getDetails() {
        return details;
    }

    public void setDetails(Error details) {
        this.details = details;
    }
}
