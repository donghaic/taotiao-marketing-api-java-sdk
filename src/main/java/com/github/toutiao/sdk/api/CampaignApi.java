package com.github.toutiao.sdk.api;

import com.github.toutiao.sdk.api.bean.ad.*;
import com.github.toutiao.sdk.support.HttpMethod;
import com.github.toutiao.sdk.support.ToutiaoResource;
import com.github.toutiao.sdk.support.ToutiaoRestException;
import com.github.toutiao.sdk.support.UrlConst;

public class CampaignApi extends ToutiaoResource {

    public static CampaignGetResponse get(String token, CampaignGetRequest request) throws ToutiaoRestException {
        String url = UrlConst.AD_CAMPAIGN_GET_URL + request.toQueryString();
        return execute(HttpMethod.GET, url, "", CampaignGetResponse.class, token);
    }

    public static CampaignCreateResponse create(String token, CampaignCreateRequest request) throws ToutiaoRestException {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.AD_CAMPAIGN_CREATE_URL, payload, CampaignCreateResponse.class, token);
    }

    public static CampaignUpdateResponse update(String token, CampaignUpdateRequest request) throws ToutiaoRestException {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.AD_CAMPAIGN_UPDATE_URL, payload, CampaignUpdateResponse.class, token);
    }

    public static CampaignStatusResponse status(String token, CampaignStatusRequest request) throws ToutiaoRestException {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.AD_CAMPAIGN_STATUS_URL, payload, CampaignStatusResponse.class, token);
    }

}
