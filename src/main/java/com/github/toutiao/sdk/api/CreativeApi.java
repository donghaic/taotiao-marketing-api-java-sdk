package com.github.toutiao.sdk.api;

import com.github.toutiao.sdk.api.bean.ad.*;
import com.github.toutiao.sdk.support.HttpMethod;
import com.github.toutiao.sdk.support.ToutiaoResource;
import com.github.toutiao.sdk.support.ToutiaoRestException;
import com.github.toutiao.sdk.support.UrlConst;

public class CreativeApi extends ToutiaoResource {

    public static CreativeListResponse getList(String token, CreativeListRequest request) throws ToutiaoRestException {
        String url = UrlConst.AD_CREATIVE_LIST_URL + request.toQueryString();
        return execute(HttpMethod.GET, url, "", CreativeListResponse.class, token);
    }

    public static CreativeGetResponse get(String token, CreativeGetRequest request) throws ToutiaoRestException {
        String url = UrlConst.AD_CREATIVE_GET_URL + request.toQueryString();
        return execute(HttpMethod.GET, url, "", CreativeGetResponse.class, token);
    }

    public static CreativeGetDetailResponse getDetail(String token, CreativeGetDetailRequest request) throws ToutiaoRestException {
        String url = UrlConst.AD_CREATIVE_GET_DETAIL_URL + request.toQueryString();
        return execute(HttpMethod.GET, url, "", CreativeGetDetailResponse.class, token);
    }


    public static CreativeCreateResponse create(String token, CreativeCreateRequest request) throws ToutiaoRestException {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.AD_CREATIVE_CREATE_URL, payload, CreativeCreateResponse.class, token);
    }

    public static CreativeUpdateResponse update(String token, CreativeUpdateRequest request) throws ToutiaoRestException {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.AD_CREATIVE_UPDATE_URL, payload, CreativeUpdateResponse.class, token);
    }

    public static CreativeStatusResponse updateStatus(String token, CreativeStatusRequest request) throws ToutiaoRestException {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.AD_CREATIVE_STATUS_URL, payload, CreativeStatusResponse.class, token);
    }


}
