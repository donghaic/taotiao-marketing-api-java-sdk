package com.github.toutiao.sdk.api.bean.auth;


import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

@Data
public class RefreshTokenResponse extends ToutiaoResponse<RefreshTokenResponse.Data> {

    @lombok.Data
    public static class Data {
        private String access_token;
        private Long expires_in;
        private String refresh_token;
        private Long refresh_token_expires_in;
    }
}
