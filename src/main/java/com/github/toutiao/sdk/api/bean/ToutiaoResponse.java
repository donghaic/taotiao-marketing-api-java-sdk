package com.github.toutiao.sdk.api.bean;

import lombok.Data;

@Data
public class ToutiaoResponse<T> extends BaseModel {
    private String request_id = "";
    private int code;
    private String message;
    private T data;
}
