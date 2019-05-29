package com.github.toutiao.sdk.api;

import com.alibaba.fastjson.JSON;
import com.github.toutiao.sdk.api.bean.ToutiaoEmptyResponse;
import com.github.toutiao.sdk.api.bean.advertiser.*;
import com.github.toutiao.sdk.api.bean.cashflow.AdverFundDailyResponse;
import com.github.toutiao.sdk.support.HttpMethod;
import com.github.toutiao.sdk.support.ToutiaoResource;
import com.github.toutiao.sdk.support.ToutiaoRestException;
import com.github.toutiao.sdk.support.UrlConst;
import com.github.toutiao.sdk.support.utils.URIUtil;

import java.util.List;
import java.util.Objects;

/**
 * 广告主相关
 */
public class AdvertiserApi extends ToutiaoResource {

    public static AdvertiserInfoResponse getInfo(String token, List<Long> advertiserIds, List<String> fieldList)
            throws ToutiaoRestException {
        String adverIds = URIUtil.encodeURIComponent(JSON.toJSONString(advertiserIds));
        String fields = "";
        if (Objects.nonNull(fieldList)) {
            fields = URIUtil.encodeURIComponent(JSON.toJSONString(fieldList));
        }
        // ?advertiser_ids=%s&fields=%s
        String url = UrlConst.ADVER_INFO_QUERY_URL + "?advertiser_ids=" + adverIds;
        //String url = String.format(UrlConst.ADVER_INFO_QUERY_URL, adverIds, fields);
        return execute(HttpMethod.GET, url, "", AdvertiserInfoResponse.class, token);
    }

    public static QualificationQueryResponse getQualification(String token, Long adverId) throws ToutiaoRestException {
        String url = String.format(UrlConst.ADVER_QUALIFICATION_QUERY_URL, adverId);
        return execute(HttpMethod.GET, url, "", QualificationQueryResponse.class, token);
    }

    public static ToutiaoEmptyResponse addQualification(String token, QualificationAddRequest request)
            throws ToutiaoRestException {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.ADVER_QUALIFICATION_CREATE_URL, payload, ToutiaoEmptyResponse.class,
                token);
    }

    public static ToutiaoEmptyResponse updateQualification(String token, QualificationUpdateRequest request)
            throws ToutiaoRestException {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.ADVER_QUALIFICATION_UPDATE_URL, payload, ToutiaoEmptyResponse.class,
                token);
    }

    public static ToutiaoEmptyResponse deteleQualification(String token, QualificationDeleteRequest request)
            throws ToutiaoRestException {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.ADVER_QUALIFICATION_DELETE_URL, payload, ToutiaoEmptyResponse.class,
                token);
    }

    public static AdverFundDailyResponse queryPublicInfo(String token, List<Long> adverIds)
            throws ToutiaoRestException {
        String advertiserIds = JSON.toJSONString(adverIds);
        String url = String.format(UrlConst.ADVER_PUBLIC_INFO_URL, advertiserIds);
        return execute(HttpMethod.GET, url, "", AdverFundDailyResponse.class, token);
    }


    public static ToutiaoEmptyResponse updateBudget(String token, UpdateBudgetRequest request) {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.ADVERTISER_UPDATE_BUDGET_URL, payload, ToutiaoEmptyResponse.class, token);
    }

}
