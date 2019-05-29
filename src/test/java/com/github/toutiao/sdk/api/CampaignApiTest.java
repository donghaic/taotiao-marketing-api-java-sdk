package com.github.toutiao.sdk.api;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.ImmutableList;
import com.github.toutiao.sdk.api.bean.ad.CampaignGetRequest;
import com.github.toutiao.sdk.api.bean.ad.CampaignGetResponse;
import com.github.toutiao.sdk.api.bean.ad.CampaignUpdateRequest;
import com.github.toutiao.sdk.api.bean.ad.CampaignUpdateResponse;
import org.junit.Test;

import java.math.BigDecimal;

public class CampaignApiTest {

    String token = "926d455dfff788fd923c3fd68b7896ec34656442";

    @Test
    public void get() {

        CampaignGetRequest request = new CampaignGetRequest();
        request.setAdvertiser_id(104168745487L);
        request.setPage_size(100);
        CampaignGetResponse campaignGetResponse = CampaignApi.get(token, request);
        System.out.println(campaignGetResponse.getData().getList().size());
    }

    @Test
    public void update() {
        CampaignUpdateRequest request = new CampaignUpdateRequest();
        request.setAdvertiser_id(99018847074L);
        request.setCampaign_id(1621536835976205L);
        request.setCampaign_name("Create_From_Api_3");
        request.setBudget(new BigDecimal(1000));


        System.out.println(JSON.toJSONString(request));

        CampaignGetRequest readReq = new CampaignGetRequest();
        readReq.setAdvertiser_id(99018847074L);

        CampaignGetRequest.Filter filter = new CampaignGetRequest.Filter();
        filter.setIds(ImmutableList.of(1621536835976205L));
        readReq.setFiltering(filter);
        CampaignGetResponse campaignGetResponse = CampaignApi.get(token, readReq);

        request.setModify_time(campaignGetResponse.getData().getList().get(0).getModify_time());
        CampaignUpdateResponse update = CampaignApi.update(token, request);
        System.out.println("--");
    }
}