package com.github.toutiao.sdk.api;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.ImmutableList;
import com.github.toutiao.sdk.api.bean.query_tool.*;
import org.junit.Test;

public class QueryToolApiTest {
    String token = "5a22937d37bfde46d1ef33a26349a87f85db0b3a";

    @Test
    public void estimateAudience() {
        QueryPredictTaRequest request = new QueryPredictTaRequest();
        request.setRetargeting_type("RETARGETING_NONE");
        request.setRetargeting_tags(ImmutableList.of(300222321L));
        QueryPredictTaResponse queryPredictTaResponse = QueryToolApi.estimateAudience(token, request);
        System.out.println("");
    }

    @Test
    public void website() {
        QueryWebsiteRequest request = new QueryWebsiteRequest();
        request.setAdvertiser_id(99018847074L);
        QueryWebsiteResponse res = QueryToolApi.website(token, request);
        System.out.println(JSON.toJSONString(res.getData()));
    }

    @Test
    public void adQuality() {
        QueryAdQualityRequest request = new QueryAdQualityRequest();
        request.setAdvertiser_id(99018847074L);
        request.setAd_ids(ImmutableList.of(1621166655944712L));
        QueryAdQualityResponse queryPredictTaResponse = QueryToolApi.adQuality(token, request);
        System.out.println("");
    }

    @Test
    public void industry() {
        QueryIndustryRequest request = new QueryIndustryRequest();
        QueryIndustryResponse res = QueryToolApi.industry(token, request);
        System.out.println(JSON.toJSONString(res));
        System.out.println("----");
    }
}