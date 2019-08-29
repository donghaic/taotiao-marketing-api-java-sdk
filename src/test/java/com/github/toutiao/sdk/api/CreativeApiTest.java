package com.github.toutiao.sdk.api;

import com.alibaba.fastjson.JSON;
import com.github.toutiao.sdk.api.bean.ad.*;
import com.google.common.collect.ImmutableList;
import org.junit.Test;

public class CreativeApiTest {
    static ImmutableList<String> field = ImmutableList.of("id", "ad_id", "advertiser_id", "title", "image_info", "image_mode", "status", "opt_status");
    String token = "3537c5cebdc3b64ce06a36aed279bb71651aff89";

    @Test
    public void getList() {
        CreativeListRequest request = new CreativeListRequest();
        request.setFields(field);
        request.setOffset(0);
        request.setLimit(100);
        request.setAdvertiser_id(110089866485L);
        CreativeListResponse response = CreativeApi.getList(token, request);
        System.out.println(response.getData().size());

        request.setOffset(100);
        response = CreativeApi.getList(token, request);
        System.out.println(JSON.toJSONString(response));


    }

    @Test
    public void getDetail() {
        CreativeGetDetailRequest request = new CreativeGetDetailRequest();
        request.setAdvertiser_id(110089866485L);
        request.setAd_id(1623512729070637L);
        request.setAd_id(1625505819085843L);
        CreativeGetDetailResponse creativeGetResponse = CreativeApi.getDetail(token, request);
        System.out.println("OK");
    }

    @Test
    public void testGet() {
        CreativeGetRequest request = new CreativeGetRequest();
        request.setAdvertiser_id(110089866485L);
        CreativeGetRequest.Filter filter = new CreativeGetRequest.Filter();
//        filter.setAd_id(1623420541997069L);
        filter.setAd_id(1625505819085843L);
        request.setFiltering(filter);
        CreativeGetResponse response = CreativeApi.get(token, request);

        System.out.println(JSON.toJSONString(response));
    }


    @Test
    public void create() {
    }

    @Test
    public void update() {
        CreativeGetDetailRequest request = new CreativeGetDetailRequest();
        request.setAdvertiser_id(99018847074L);
        request.setAd_id(1620350280045608L);
        CreativeGetDetailResponse creativeGetResponse = CreativeApi.getDetail(token, request);
        System.out.println("OK");
        CreativeGetDetailResponse.CreativeInfos data = creativeGetResponse.getData();

        CreativeUpdateRequest update = new CreativeUpdateRequest();
        update.setModify_time(data.getModify_time());
        update.setAdvertiser_id(data.getAdvertiser_id());
        update.setAd_id(data.getAd_id());
        update.setTrack_url(data.getTrack_url());
        update.setAction_track_url(data.getAction_track_url());
        update.setVideo_play_effective_track_url(data.getVideo_play_effective_track_url());
        update.setVideo_play_track_url(data.getVideo_play_track_url());
        update.setIs_comment_disable(data.getIs_comment_disable());
        update.setClose_video_detail(data.getClose_video_detail());
        update.setClose_video_detail(data.getClose_video_detail());
        update.setSmart_inventory(data.getSmart_inventory());
        update.setInventory_type(data.getInventory_type());
        update.setSource(data.getSource());
        update.setApp_name(data.getApp_name());
        update.setWeb_url(data.getWeb_url());
        update.setAd_keywords(data.getAd_keywords());
        update.setAction_track_url(data.getAction_track_url());
        update.setAd_category(data.getAd_category());
        update.setAdvanced_creative_type(data.getAdvanced_creative_type());
        update.setAdvanced_creative_title(data.getAdvanced_creative_title());
        update.setPhone_number(data.getPhone_number());
        update.setButton_text(data.getButton_text());
        update.setForm_url(data.getForm_url());
        update.setCreative_display_mode(data.getCreative_display_mode());
        update.setTitle_list(data.getTitle_list());
        update.setImage_list(data.getImage_list());
        update.setCreatives(data.getCreatives());


        update.setAd_keywords(ImmutableList.of("games", "nba"));
        update.setIs_comment_disable(1);

        CreativeUpdateResponse updateRes = CreativeApi.update(token, update);
        System.out.println(JSON.toJSONString(updateRes.getData()));
    }

    @Test
    public void testUpdate() {

        
        //CreativeUpdateRequest request = JSON.parseObject(data, CreativeUpdateRequest.class);
        //CreativeUpdateResponse updateRes = CreativeApi.update(token, request);
       // System.out.println(JSON.toJSONString(updateRes.getData()));
    }

    @Test
    public void updateStatus() {
    }


    @Test
    public void create1() {
     
   
    }
}
