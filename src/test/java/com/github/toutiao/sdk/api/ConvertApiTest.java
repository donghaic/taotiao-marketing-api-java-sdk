package com.github.toutiao.sdk.api;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.ImmutableList;
import com.github.toutiao.sdk.api.bean.convert.*;
import org.junit.Test;

public class ConvertApiTest {
    String token = "45612183f2663bc4db21dc4d117240c9fbde5e3e";

    @Test
    public void createLandingpageApi() {

        ConvertCreateRequest request = new ConvertCreateRequest();
        request.setAdvertiser_id(99018847074L);
        request.setName("test_from_api-h5");
        request.setConvert_source_type("AD_CONVERT_SOURCE_TYPE_H5_API");
        request.setConvert_type("AD_CONVERT_TYPE_CUSTOMER_EFFECTIVE");
        request.setExternal_url("https://sdk.game.nextjoy.com/download/app/59");
        // id = 1621528764434551
        ConvertCreateResponse response = ConvertApi.create(token, request);
        System.out.println(JSON.toJSONString(response));
    }

    @Test
    public void createAppDownloadApi() {
        ConvertCreateRequest request = new ConvertCreateRequest();
        request.setAdvertiser_id(99018847074L);
        request.setName("api_AppDownload_1");
        request.setConvert_source_type("AD_CONVERT_SOURCE_TYPE_APP_DOWNLOAD");
        request.setConvert_type("AD_CONVERT_TYPE_ACTIVE");
        request.setApp_type("APP_IOS");
        request.setDownload_url("https://itunes.apple.com/cn/app/id1411829486?mt=8");
        request.setAction_track_url("https://uri6.com/tkio/ZZjMNva?imei=__IMEI__" +
                "&androidid=__ANDROIDID1__&ip=__IP__&ts=__TS__&os=__OS__&idfa=__IDFA__" +
                "&subchannel=__CID__&callback_param=__CALLBACK_PARAM__" +
                "&callback=__CALLBACK_URL__&noredirect=true&aid=__AID__&csite=__CSITE__&ctype=__CTYPE__");
        request.setPackage_name("com.sy2.mxj.online");

        ConvertCreateResponse response = ConvertApi.create(token, request);
        System.out.println(JSON.toJSONString(response));
        //{"code":0,"data":{"id":"1621532501141527","opt_status":"AD_CONVERT_OPT_STATUS_ENABLE","status":"AD_CONVERT_STATUS_INACTIVE"},"message":"OK","request_id":"20190102152531010010069140161F5D"}

    }

    @Test
    public void updateStatus() {
        ConvertStatusRequest request = new ConvertStatusRequest();
        request.setAdvertiser_id(99018847074L);
        request.setConvert_id(1621528764434551L);
        request.setOpt_status("AD_CONVERT_OPT_STATUS_ENABLE");
        ConvertEmptyResponse response = ConvertApi.updateStatus(token, request);
    }

    @Test
    public void queryDetail() {
        ConvertDetailRequest request = new ConvertDetailRequest();
        request.setAdvertiser_id(99018847074L);
        request.setConvert_id(1622896297682957L);
        ConvertDetailResponse response = ConvertApi.queryDetail(token, request);
        System.out.println(response.toJSON());
        System.out.println("-------");
    }

    @Test
    public void list() {
        ConvertListIdRequest request = new ConvertListIdRequest();
        request.setAdvertiser_id(99018847074L);
        ConvertListIdResponse response = ConvertApi.list(token, request);
        ConvertListIdResponse.Data data = response.getData();
        System.out.printf("data=" + JSON.toJSONString(data));
    }

    @Test
    public void availableList() {
        ConvertQueryAvailableConvertIdRequest request = new ConvertQueryAvailableConvertIdRequest();
        request.setAdvertiser_id(99018847074L);
        request.setExternal_url("https://www.chengzijianzhan.com/tetris/page/6646197039874965518");
        ConvertQueryAvailableConvertIdResponse convertQueryAvailableConvertIdResponse = ConvertApi.availableList(token, request);
        System.out.println(convertQueryAvailableConvertIdResponse.getData().getActive_convert_list().size());
    }

    @Test
    public void push() {
        // {"advertiser_id":99018847074,"convert_id":1608210790450179,"target_advertiser_ids":[99839532924]}
        String token = "a46fdad84878360d138393fb43dd56f4638a10fd";
        ConvertPushRequest convertPushRequest = new ConvertPushRequest();
        convertPushRequest.setAdvertiser_id(99018847074L);
        convertPushRequest.setConvert_id(1622896297682957L);
        convertPushRequest.setTarget_advertiser_ids(ImmutableList.of(99839532924L));
        System.out.println("convertPushRequest ==> " + JSON.toJSONString(convertPushRequest));
        ConvertEmptyResponse push = ConvertApi.push(token, convertPushRequest);
        System.out.println(push.toJSON());
    }
}