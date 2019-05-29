package com.github.toutiao.sdk.api;

import com.github.toutiao.sdk.api.bean.convert.*;
import com.github.toutiao.sdk.support.HttpMethod;
import com.github.toutiao.sdk.support.ToutiaoResource;
import com.github.toutiao.sdk.support.ToutiaoRestException;
import com.github.toutiao.sdk.support.UrlConst;

/**
 * admin
 * on 2018/12/26.
 */
public class ConvertApi extends ToutiaoResource {


    public static ConvertCreateResponse create(String token, ConvertCreateRequest request) throws ToutiaoRestException {
        String url = UrlConst.AD_CONVERT_CREATE_URL;
        String payload = request.toJSON();
        return execute(HttpMethod.POST, url, payload, ConvertCreateResponse.class, token);
    }

    public static ConvertEmptyResponse updateStatus(String token, ConvertStatusRequest request) {
        String url = UrlConst.AD_CONVERT_STATUS_URL;
        String payload = request.toJSON();
        return execute(HttpMethod.POST, url, payload, ConvertEmptyResponse.class, token);
    }

    public static ConvertEmptyResponse push(String token, ConvertPushRequest request) {
        String url = UrlConst.AD_CONVERT_PUSH_URL;
        String payload = request.toJSON();
        return execute(HttpMethod.POST, url, payload, ConvertEmptyResponse.class, token);
    }

    public static ConvertDetailResponse queryDetail(String token, ConvertDetailRequest request) throws ToutiaoRestException {
        String queryString = request.toQueryString();
        String url = UrlConst.AD_CONVERT_DETAIL_URL + "?" + queryString;
        return execute(HttpMethod.GET, url, "", ConvertDetailResponse.class, token);
    }


    public static ConvertListIdResponse list(String token, ConvertListIdRequest request) {
        String queryString = request.toQueryString();
        String url = UrlConst.AD_CONVERT_ADV_LIST_URL + "?" + queryString;
        return execute(HttpMethod.GET, url, "", ConvertListIdResponse.class, token);
    }

    public static ConvertQueryAvailableConvertIdResponse availableList(String token, ConvertQueryAvailableConvertIdRequest request) {
        String queryString = request.toQueryString();
        String url = UrlConst.AD_CONVERT_SERVERING_LIST_URL + "?" + queryString;
        return execute(HttpMethod.GET, url, "", ConvertQueryAvailableConvertIdResponse.class, token);
    }
}
