package com.github.toutiao.sdk.api;

import com.github.toutiao.sdk.api.bean.ad.*;
import com.github.toutiao.sdk.support.HttpMethod;
import com.github.toutiao.sdk.support.ToutiaoResource;
import com.github.toutiao.sdk.support.ToutiaoRestException;
import com.github.toutiao.sdk.support.UrlConst;

public class AdApi extends ToutiaoResource {

    public static AdGetResponse get(String token, AdGetRequest request) throws ToutiaoRestException {
        String url = UrlConst.AD_GROUP_GET_URL + request.toQueryString();
        return execute(HttpMethod.GET, url, "", AdGetResponse.class, token);
    }

    public static AdCreateResponse create(String token, AdCreateRequest request) throws ToutiaoRestException {
        String url = UrlConst.AD_GROUP_CREATE_URL;
        String payload = request.toJSON();
        return execute(HttpMethod.POST, url, payload, AdCreateResponse.class, token);
    }

    public static AdUpdateResponse update(String token, AdUpdateRequest request) throws ToutiaoRestException {
        String url = UrlConst.AD_GROUP_UPDATE_URL;
        String payload = request.toJSON();
        return execute(HttpMethod.POST, url, payload, AdUpdateResponse.class, token);
    }

    public static AdStatusResponse updateStatus(String token, AdStatusRequest request) throws ToutiaoRestException {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.AD_GROUP_STATUS_URL, payload, AdStatusResponse.class, token);
    }

    public static AdBudgetResponse updateBudget(String token, AdBudgetRequest request) throws ToutiaoRestException {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.AD_GROUP_BUDGET_URL, payload, AdBudgetResponse.class, token);
    }

    public static AdBidPriceResponse updateBidPrice(String token, AdBidPriceRequest request) throws ToutiaoRestException {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.AD_GROUP_BID_PRICE_URL, payload, AdBidPriceResponse.class, token);
    }


}
