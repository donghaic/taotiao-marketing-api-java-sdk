package com.github.toutiao.sdk.api;

import com.alibaba.fastjson.JSON;
import com.github.toutiao.sdk.api.bean.report.*;
import com.github.toutiao.sdk.support.ToutiaoRestException;
import com.github.toutiao.sdk.support.code.TimeGranularity;
import com.google.common.collect.ImmutableList;
import org.junit.Test;

public class ReportApiTest extends TouTaioTestBase {

    @Test
    public void create() {
    }

    @Test
    public void update() {
    }

    @Test
    public void status() {
    }

    @Test
    public void getAdverReport() throws ToutiaoRestException {
        String token = "844c66673e4451f86a65b72074ae25d42d4a0b87";
        ReportAdverRequest adverReport = new ReportAdverRequest();
        adverReport.setAdvertiser_id(108658399099L);
        adverReport.setStart_date("2018-12-18");
        adverReport.setEnd_date("2018-12-18");
        adverReport.setTime_granularity(TimeGranularity.STAT_TIME_GRANULARITY_HOURLY.toString());
        ReportAdverResponse adInfo = ReportApi.getAdverReport(token, adverReport);
        System.out.println(adInfo.toJSON());
    }

    @Test
    public void getCampaignReport() throws ToutiaoRestException {
        String token = "b137c672c8d40831f96921aa008f3aa9d9fe75a8";
        ReportCampaignRequest request = new ReportCampaignRequest();
//        request.setAdvertiser_id(107911082722L);
        request.setAdvertiser_id(105491727872L);
        request.setStart_date("2018-12-13");
        request.setEnd_date("2018-12-13");
        request.setGroup_by(ImmutableList.of("STAT_GROUP_BY_FIELD_ID", "STAT_GROUP_BY_FIELD_STAT_TIME"));
        ReportCampaignResponse campaignReport = ReportApi.getCampaignReport(token, request);
        System.out.println(JSON.toJSONString(campaignReport));
        System.out.printf("-----------------");
    }

    @Test
    public void getAdReport() throws ToutiaoRestException {

    }

    @Test
    public void getCreativeReport() throws ToutiaoRestException {

    }

    @Test
    public void queryAgentReport() {
        ReportAgentRequest request = new ReportAgentRequest();
        request.setTime_granularity(TimeGranularity.STAT_TIME_GRANULARITY_DAILY.toString())
                .setPage(1)
                .setPage_size(1000)
                .setGroup_by(ImmutableList.of("STAT_GROUP_BY_FIELD_STAT_TIME", "STAT_GROUP_BY_FIELD_ID"))
                .setAdvertiser_id(6935103832L)
                .setStart_date("2018-11-05")
                .setEnd_date("2018-12-04");
        ReportAgentResponse res = ReportApi.queryAgentReport("1941427a73ead06c9c843479124374227e524725", request);
        System.out.println(JSON.toJSONString(res));
        System.out.println("--------------------");
    }
}
