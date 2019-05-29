package com.github.toutiao.sdk.api.bean.auth;


import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

@Data
public class AccessTokenResponse extends ToutiaoResponse<AccessTokenResponse.Data> {

    @lombok.Data
    public static class Data {
        private String access_token;
        private Long expires_in;
        private String refresh_token;
        private Long advertiser_id;
        private Long refresh_token_expires_in;
    }
}
