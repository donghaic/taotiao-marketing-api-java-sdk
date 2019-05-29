package com.github.toutiao.sdk.api;

import com.alibaba.fastjson.JSON;
import com.github.toutiao.sdk.api.bean.auth.AccessTokenRequest;
import com.github.toutiao.sdk.api.bean.auth.AccessTokenResponse;
import com.github.toutiao.sdk.api.bean.auth.RefreshTokenRequest;
import com.github.toutiao.sdk.api.bean.auth.RefreshTokenResponse;
import com.github.toutiao.sdk.support.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * OAuth2.0授权相关
 */
public class AuthApi extends ToutiaoResource {

    public static String buildAuthorizationUrl(ToutiaoConfig conf, String redirectURI, List<String> scopeList,
                                               String state) {
        String scope = JSON.toJSONString(scopeList);
        return String.format(UrlConst.CONNECT_OAUTH2_AUTHORIZE_URL, conf.getAppId(), state,
                scope, redirectURI);
    }

    public static AccessTokenResponse getAccessToken(ToutiaoConfig conf, String authCode) throws ToutiaoRestException {
        AccessTokenRequest request = new AccessTokenRequest();
        request.setApp_id(conf.getAppId());
        request.setSecret(conf.getAppSecret());
        request.setGrant_type("auth_code");
        request.setAuth_code(authCode);
        String payLoad = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.OAUTH2_ACCESS_TOKEN_URL, payLoad, AccessTokenResponse.class, null);

    }

    public static RefreshTokenResponse refreshAccessToken(ToutiaoConfig conf, String refreshToken)
            throws ToutiaoRestException {
        RefreshTokenRequest request = new RefreshTokenRequest();
        request.setApp_id(conf.getAppId());
        request.setSecret(conf.getAppSecret());
        request.setGrant_type("refresh_token");
        request.setRefresh_token(refreshToken);
        return execute(HttpMethod.POST, UrlConst.OAUTH2_REFRESH_TOKEN_URL, request.toJSON(), RefreshTokenResponse.class, null);
    }

}
