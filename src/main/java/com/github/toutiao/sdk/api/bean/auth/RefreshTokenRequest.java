package com.github.toutiao.sdk.api.bean.auth;

import com.github.toutiao.sdk.api.bean.BaseModel;
import lombok.Data;

@Data
public class RefreshTokenRequest extends BaseModel {
    private String app_id;
    private String secret;
    private String grant_type;
    private String refresh_token;

}
