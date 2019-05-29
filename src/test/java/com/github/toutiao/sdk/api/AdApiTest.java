package com.github.toutiao.sdk.api;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.ImmutableList;
import com.github.toutiao.sdk.api.bean.ad.*;
import org.junit.Test;

public class AdApiTest {
    String token = "844c66673e4451f86a65b72074ae25d42d4a0b87";

    @Test
    public void updateStatus() {
        AdStatusRequest request = JSON.parseObject("{\"ad_ids\":[1612006256830468],\"advertiser_id\":104168745487,\"opt_status\":\"enable\"}", AdStatusRequest.class);
        AdStatusResponse response = AdApi.updateStatus(token, request);
        System.out.println("--");
    }

    @Test
    public void get() {

        AdGetRequest request = new AdGetRequest();
        request.setAdvertiser_id(99018847074L);
        AdGetRequest.Filter filter = new AdGetRequest.Filter();
        filter.setIds(ImmutableList.of(1622898510099496L));
        filter.setIds(ImmutableList.of(1608245344311357L));
        filter.setIds(ImmutableList.of(1608218921901102L));
        filter.setStatus("AD_STATUS_ALL");
        request.setFiltering(filter);
        System.out.println(JSON.toJSONString(request));
        AdGetResponse adGetResponse = AdApi.get(token, request);
        System.out.println(JSON.toJSONString(adGetResponse));
    }

    @Test
    public void create() {
        AdCreateRequest request = new AdCreateRequest();
        request.setAdvertiser_id(99018847074L);
        request.setCampaign_id(1621000677327918L);
        request.setDelivery_range("DEFAULT");
        request.setBudget_mode("BUDGET_MODE_DAY");
        request.setBudget(100.8D);
        request.setStart_time("2019-01-04 00:00");
        request.setEnd_time(null);
        request.setBid(20.0D);
        request.setPricing("PRICING_CPM");
        request.setSchedule_type("SCHEDULE_FROM_NOW");
        request.setSchedule_time("111111111111111111001110111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        request.setFlow_control_mode("FLOW_CONTROL_MODE_SMOOTH");
        //request.setOpen_url("");
        request.setExternal_url("https://ad.toutiao.com/tetris/page/1610758062697475/");
        request.setDownload_url("http://res.play700.com/adapk/hyxxl2_tt.apk");
        request.setName("API-测试创建-有定向");
        request.setApp_type("APP_ANDROID");
        request.setPkg("com.ext.mex");
        // request.setHide_if_converted();
        request.setHide_if_exists(1);
        request.setCpa_bid(20.d);
        request.setConvert_id(1610762085507124L);

        // 定向无
        request.setGender("GENDER_MALE");
        request.setAge(ImmutableList.of("AGE_BETWEEN_24_30", "AGE_BETWEEN_31_40"));
        request.setAndroid_osv("6.0");
        request.setCarrier(ImmutableList.of("MOBILE", "UNICOM"));
        request.setAc(ImmutableList.of("WIFI"));
        request.setDevice_brand(ImmutableList.of("HUAWEI", "XIAOMI", "SAMSUNG", "OPPO", "VIVO"));

        AdCreateResponse response = AdApi.create(token, request);

        System.out.println(response.getData().getAd_id());

    }

    @Test
    public void update() {
        AdUpdateRequest request = new AdUpdateRequest();
        request.setAdvertiser_id(99018847074L);
        request.setAd_id(1621699512630296L);
        request.setDelivery_range("DEFAULT");
        request.setBudget_mode("BUDGET_MODE_DAY");
        request.setBudget(100.8D);
        request.setStart_time("2019-01-04 00:00");
        request.setEnd_time(null);
        request.setBid(20.0D);
        request.setPricing("PRICING_CPM");
        request.setSchedule_type("SCHEDULE_FROM_NOW");
        request.setSchedule_time("111111111111111111001110111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        request.setSchedule_time("000000000000000000000000000000000000000000000000000000110000000000000000000000000000000000000000000000000000000011000000000000000000000000000000111111111111111111111111111111111111111111111111000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        request.setFlow_control_mode("FLOW_CONTROL_MODE_SMOOTH");
        //request.setOpen_url("");
        request.setExternal_url("https://ad.toutiao.com/tetris/page/1610758062697475/");
        request.setDownload_url("http://res.play700.com/adapk/hyxxl2_tt.apk");
        request.setName("API-测试创建-更新-有定向");
        request.setApp_type("APP_ANDROID");
        request.setPkg("com.ext.mex");
        // request.setHide_if_converted();
        request.setHide_if_exists(1);
        request.setCpa_bid(20.d);
        request.setConvert_id(1610762085507124L);

        // 定向无
        request.setGender("GENDER_MALE");
        request.setAge(ImmutableList.of("AGE_BETWEEN_24_30", "AGE_BETWEEN_31_40"));
        request.setAndroid_osv("6.0");
        request.setCarrier(ImmutableList.of("MOBILE", "UNICOM"));
        request.setAc(ImmutableList.of("WIFI"));
        request.setDevice_brand(ImmutableList.of("HUAWEI", "XIAOMI", "SAMSUNG", "OPPO"));
        request.setCity(ImmutableList.of(11L, 14L));
        request.setDistrict("CITY");

        AdGetRequest getReq = new AdGetRequest();
        getReq.setAdvertiser_id(99018847074L);
        AdGetRequest.Filter filter = new AdGetRequest.Filter();
        filter.setIds(ImmutableList.of(1621699512630296L));
        getReq.setFiltering(filter);
        AdGetResponse getRes = AdApi.get(token, getReq);

        request.setModify_time(getRes.getData().getList().get(0).getModify_time());
        AdUpdateResponse response = AdApi.update(token, request);

        System.out.println(response.getData().getAd_id());
    }

    @Test
    public void updateBudget() {
    }

    @Test
    public void updateBidPrice() {
    }
}