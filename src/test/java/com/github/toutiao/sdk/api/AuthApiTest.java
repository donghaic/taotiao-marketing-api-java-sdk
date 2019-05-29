package com.github.toutiao.sdk.api;


import com.github.toutiao.sdk.api.bean.auth.AccessTokenResponse;
import com.github.toutiao.sdk.api.bean.auth.RefreshTokenResponse;
import com.github.toutiao.sdk.support.ToutiaoConfig;
import com.github.toutiao.sdk.support.ToutiaoRestException;
import com.google.common.collect.ImmutableList;
import org.junit.Test;

import java.util.List;

public class AuthApiTest {
    static ToutiaoConfig conf;

    static {
        conf = new ToutiaoConfig();
        conf.setAppId("appid");
        conf.setAppSecret("AppSecret");
    }

    @Test
    public void buildAuthorizationUrl() {
        String callbackUrl = "http://mktapi.mobcastlead.com/oauth2/callback/";
        // "account_service","ad_service","dmp_service","report_service"
        List<String> scopeList = ImmutableList.of("account_service", "ad_service", "dmp_service", "report_service");
        String authorizationUrl = AuthApi.buildAuthorizationUrl(conf, callbackUrl, scopeList, "");
        System.out.println(authorizationUrl);
    }

    @Test
    public void getAccessToken() throws ToutiaoRestException {
        String auth_code = "74ee17215768d506c0db616aa27edaa8dab2296b";
        AccessTokenResponse accessToken = AuthApi.getAccessToken(conf, auth_code);

        System.out.println(accessToken.toJSON());
        // b8cc24ac1f832b86bf4814faf029d0bf2b0edab1
    }

    @Test
    public void refreshAccessToken() throws ToutiaoRestException {
        String refreshToken = "011906d9d41db67b11696b9306e45aa3a68b532f";
        RefreshTokenResponse refreshTokenResponse = AuthApi.refreshAccessToken(conf, refreshToken);

        System.out.println(refreshTokenResponse.toJSON());
    }
}
