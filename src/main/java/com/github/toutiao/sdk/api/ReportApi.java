package com.github.toutiao.sdk.api;

import com.github.toutiao.sdk.api.bean.report.*;
import com.github.toutiao.sdk.support.HttpMethod;
import com.github.toutiao.sdk.support.ToutiaoResource;
import com.github.toutiao.sdk.support.ToutiaoRestException;
import com.github.toutiao.sdk.support.UrlConst;

public class ReportApi extends ToutiaoResource {

    public static ReportAdverResponse getAdverReport(String token, ReportAdverRequest request) throws ToutiaoRestException {
        String url = UrlConst.REPORT_ADVER_URL + request.toQueryString();
        return execute(HttpMethod.GET, url, "", ReportAdverResponse.class, token);
    }


    public static ReportCampaignResponse getCampaignReport(String token, ReportCampaignRequest request) throws ToutiaoRestException {
        String url = UrlConst.REPORT_CAMPAIGN_URL + request.toQueryString();
        return execute(HttpMethod.GET, url, "", ReportCampaignResponse.class, token);
    }

    public static ReportAdResponse getAdReport(String token, ReportAdRequest request) throws ToutiaoRestException {
        String url = UrlConst.REPORT_GROUP_URL + request.toQueryString();
        return execute(HttpMethod.GET, url, "", ReportAdResponse.class, token);
    }

    public static ReportCreativeResponse getCreativeReport(String token, ReportCreativeRequest request) throws ToutiaoRestException {
        String url = UrlConst.REPORT_CRATIVE_URL + request.toQueryString();
        return execute(HttpMethod.GET, url, "", ReportCreativeResponse.class, token);
    }

    public static ReportAgentResponse queryAgentReport(String token, ReportAgentRequest reportRequest) {
        String queryString = reportRequest.toQueryString();
        String url = UrlConst.REPORT_AGENT_URL + "?" + queryString;
        return execute(HttpMethod.GET, url, "", ReportAgentResponse.class, token);
    }
}
