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
        String data = "{\"action_track_url\":\"1\",\"ad_category\":214,\"ad_categorys\":[1,65,214],\"ad_id\":1622893731457032,\"ad_keywords\":[\"fadsfadfa\",\"fads\"],\"advanced_creative_title\":\"1副标题\",\"advertiser_id\":99018847074,\"app_name\":\"英明吗1\",\"creative_display_mode\":\"CREATIVE_DISPLAY_MODE_CTR\",\"creatives\":[{\"creative_id\":1623329939338275,\"creative_word_ids\":[],\"image_id\":\"\",\"image_ids\":[\"web.business.image/201901215d0d905504d6ce5945ef8fe4\"],\"image_mode\":\"CREATIVE_IMAGE_MODE_LARGE\",\"image_url\":\"\",\"image_urls\":[\"http://res.ad-mex.com/tianyi/20190121/aa2bf7433bfe46ce97f3e2465b73a552.jpg\"],\"third_party_id\":\"\",\"title\":\"title个地方公司的风格s\",\"video_id\":\"\",\"video_url\":\"\"},{\"creative_id\":1623327553114152,\"creative_word_ids\":[],\"image_id\":\"\",\"image_ids\":[\"web.business.image/201901225d0d0e2a879e066f4b3e91f1\"],\"image_mode\":\"CREATIVE_IMAGE_MODE_LARGE\",\"image_url\":\"\",\"image_urls\":[\"http://res.ad-mex.com/tianyi/20190122/5fa33912f333433d82c197319e9ea898.jpg\"],\"third_party_id\":\"\",\"title\":\"title个地方公司的风格2s\",\"video_id\":\"\",\"video_url\":\"\"},{\"creative_id\":1623329939449902,\"creative_word_ids\":[],\"image_id\":\"\",\"image_ids\":[\"web.business.image/201901225d0d0e2a879e066f4b3e91f1\"],\"image_mode\":\"CREATIVE_IMAGE_MODE_LARGE\",\"image_url\":\"\",\"image_urls\":[\"http://res.ad-mex.com/tianyi/20190122/5fa33912f333433d82c197319e9ea898.jpg\"],\"third_party_id\":\"\",\"title\":\"title个地方公司的风格s\",\"video_id\":\"\",\"video_url\":\"\"},{\"creative_id\":1623329939459112,\"creative_word_ids\":[],\"image_id\":\"\",\"image_ids\":[\"web.business.image/201901225d0d0e2a879e066f4b3e91f1\"],\"image_mode\":\"CREATIVE_IMAGE_MODE_LARGE\",\"image_url\":\"\",\"image_urls\":[\"http://res.ad-mex.com/tianyi/20190122/5fa33912f333433d82c197319e9ea898.jpg\"],\"third_party_id\":\"\",\"title\":\"title个地方公司的风格s\",\"video_id\":\"\",\"video_url\":\"\"},{\"creative_id\":1623329939339299,\"creative_word_ids\":[],\"image_id\":\"\",\"image_ids\":[\"web.business.image/201901225d0d0e2a879e066f4b3e91f1\"],\"image_mode\":\"CREATIVE_IMAGE_MODE_LARGE\",\"image_url\":\"\",\"image_urls\":[\"http://res.ad-mex.com/tianyi/20190122/5fa33912f333433d82c197319e9ea898.jpg\"],\"third_party_id\":\"\",\"title\":\"title个地方公司的风格1\",\"video_id\":\"\",\"video_url\":\"\"},{\"creative_id\":1623329939448878,\"creative_word_ids\":[],\"image_id\":\"\",\"image_ids\":[\"web.business.image/201901225d0d0e2a879e066f4b3e91f1\"],\"image_mode\":\"CREATIVE_IMAGE_MODE_LARGE\",\"image_url\":\"\",\"image_urls\":[\"http://res.ad-mex.com/tianyi/20190122/5fa33912f333433d82c197319e9ea898.jpg\"],\"third_party_id\":\"\",\"title\":\"title个地方公司的风格1\",\"video_id\":\"\",\"video_url\":\"\"},{\"creative_id\":1623329939460136,\"creative_word_ids\":[\"1736\"],\"image_id\":\"\",\"image_ids\":[\"web.business.image/201901225d0d0e2a879e066f4b3e91f1\"],\"image_mode\":\"CREATIVE_IMAGE_MODE_LARGE\",\"image_url\":\"\",\"image_urls\":[\"http://res.ad-mex.com/tianyi/20190122/5fa33912f333433d82c197319e9ea898.jpg\"],\"third_party_id\":\"\",\"title\":\"title个地方公司的风格{星期}\",\"video_id\":\"\",\"video_url\":\"\"},{\"creative_id\":1623329939338275,\"creative_word_ids\":[],\"image_id\":\"\",\"image_ids\":[\"web.business.image/201901215d0d905504d6ce5945ef8fe4\"],\"image_mode\":\"CREATIVE_IMAGE_MODE_LARGE\",\"image_url\":\"\",\"image_urls\":[\"http://res.ad-mex.com/tianyi/20190121/aa2bf7433bfe46ce97f3e2465b73a552.jpg\"],\"third_party_id\":\"\",\"title\":\"title个地方公司的风格2\",\"video_id\":\"\",\"video_url\":\"\"},{\"creative_id\":1623327553114152,\"creative_word_ids\":[],\"image_id\":\"\",\"image_ids\":[\"web.business.image/201901225d0d0e2a879e066f4b3e91f1\"],\"image_mode\":\"CREATIVE_IMAGE_MODE_LARGE\",\"image_url\":\"\",\"image_urls\":[\"http://res.ad-mex.com/tianyi/20190122/5fa33912f333433d82c197319e9ea898.jpg\"],\"third_party_id\":\"\",\"title\":\"title个地方公司的风格2\",\"video_id\":\"\",\"video_url\":\"\"},{\"creative_id\":1623329939449902,\"creative_word_ids\":[\"4\"],\"image_id\":\"\",\"image_ids\":[\"web.business.image/201901225d0d0e2a879e066f4b3e91f1\"],\"image_mode\":\"CREATIVE_IMAGE_MODE_LARGE\",\"image_url\":\"\",\"image_urls\":[\"http://res.ad-mex.com/tianyi/20190122/5fa33912f333433d82c197319e9ea898.jpg\"],\"third_party_id\":\"\",\"title\":\"title个地方公司的风格{地点}\",\"video_id\":\"\",\"video_url\":\"\"},{\"creative_id\":1623329939459112,\"creative_word_ids\":[\"1736\"],\"image_id\":\"\",\"image_ids\":[\"web.business.image/201901225d0d0e2a879e066f4b3e91f1\"],\"image_mode\":\"CREATIVE_IMAGE_MODE_LARGE\",\"image_url\":\"\",\"image_urls\":[\"http://res.ad-mex.com/tianyi/20190122/5fa33912f333433d82c197319e9ea898.jpg\"],\"third_party_id\":\"\",\"title\":\"title个地方公司的风格{星期}\",\"video_id\":\"\",\"video_url\":\"\"},{\"creative_id\":1623329939339299,\"creative_word_ids\":[\"1737\"],\"image_id\":\"\",\"image_ids\":[\"web.business.image/201901225d0d0e2a879e066f4b3e91f1\"],\"image_mode\":\"CREATIVE_IMAGE_MODE_LARGE\",\"image_url\":\"\",\"image_urls\":[\"http://res.ad-mex.com/tianyi/20190122/5fa33912f333433d82c197319e9ea898.jpg\"],\"third_party_id\":\"\",\"title\":\"title个地方公司的风格{年龄}\",\"video_id\":\"\",\"video_url\":\"\"},{\"creative_id\":1623329939448878,\"creative_word_ids\":[\"4\"],\"image_id\":\"\",\"image_ids\":[\"web.business.image/201901225d0d0e2a879e066f4b3e91f1\"],\"image_mode\":\"CREATIVE_IMAGE_MODE_LARGE\",\"image_url\":\"\",\"image_urls\":[\"http://res.ad-mex.com/tianyi/20190122/5fa33912f333433d82c197319e9ea898.jpg\"],\"third_party_id\":\"\",\"title\":\"title个地方公司的风格{地点}\",\"video_id\":\"\",\"video_url\":\"\"},{\"creative_id\":1623329939460136,\"creative_word_ids\":[\"1736\"],\"image_id\":\"\",\"image_ids\":[\"web.business.image/201901215d0d905504d6ce5945ef8fe4\"],\"image_mode\":\"CREATIVE_IMAGE_MODE_LARGE\",\"image_url\":\"\",\"image_urls\":[\"http://res.ad-mex.com/tianyi/20190121/aa2bf7433bfe46ce97f3e2465b73a552.jpg\"],\"third_party_id\":\"\",\"title\":\"title个地方公司的风格{星期}\",\"video_id\":\"\",\"video_url\":\"\"}],\"inventory_type\":[\"INVENTORY_FEED\",\"INVENTORY_HOTSOON_FEED\",\"INVENTORY_VIDEO_FEED\",\"INVENTORY_UNION_SLOT\"],\"is_comment_disable\":1,\"landing_type\":\"APP\",\"smart_inventory\":1,\"track_url\":\"1\",\"video_play_done_track_url\":\"1\",\"video_play_effective_track_url\":\"1\",\"video_play_track_url\":\"1\",\"web_url\":\"https://www.chengzijianzhan.com/tetris/page/6646197039874965518/\"}\n";

        CreativeUpdateRequest request = JSON.parseObject(data, CreativeUpdateRequest.class);
        CreativeUpdateResponse updateRes = CreativeApi.update(token, request);
        System.out.println(JSON.toJSONString(updateRes.getData()));
    }

    @Test
    public void updateStatus() {
    }


    @Test
    public void create1() {
        String data = "{ \"ad_category\":3055,\"ad_id\":1623256141583406,\"ad_keywords\":[\"发斯蒂芬\"],\"third_industry_id\":35," +
                " \"advanced_creative_title\":\"副标题\",\"advertiser_id\":100188697510,\"app_name\":\"应用ing\",\"creative_display_mode\":\"CREATIVE_DISPLAY_MODE_CTR\", " +
                "\"creatives\":[{\"image_ids\":[\"web.business.image/201901215d0dc76638fd4992409bb44b\"]," +
                "\"image_mode\":\"CREATIVE_IMAGE_MODE_LARGE_VERTICAL\"," +
                "\"image_urls\":[\"http://res.ad-mex.com/tianyi/20190121/4e0b7d5727b2486db5e33e244ba8491f.jpg\"],\"title\":\"地点年龄\"}]," +
                "\"inventory_type\":[\"INVENTORY_FEED\"]," +
                "\"is_comment_disable\":1,\"web_url\":\"https://www.chengzijianzhan.com/tetris/page/1603850620900366\", \"advertiser_id\":99018847074}";

        data = " { \"ad_category\":3055,\"ad_id\":1622991879541768,\"ad_keywords\":[\"发斯蒂芬\"],\"advanced_creative_title\":\"副标题\",\"advertiser_id\":99018847074,\"app_name\":\"应用ing\",\"creative_display_mode\":\"CREATIVE_DISPLAY_MODE_CTR\", \"creatives\":[{\"image_ids\":[\"web.business.image/201901215d0dc76638fd4992409bb44b\"],\"image_mode\":\"CREATIVE_IMAGE_MODE_LARGE_VERTICAL\",\"image_urls\":[\"http://res.ad-mex.com/tianyi/20190121/4e0b7d5727b2486db5e33e244ba8491f.jpg\"],\"title\":\"地点年龄中国人发展中心1213213\"}],\"smart_inventory\":1,\"inventory_type\":[\"INVENTORY_FEED\",\"INVENTORY_TEXT_LINK\",\"INVENTORY_VIDEO_FEED\",\"INVENTORY_HOTSOON_FEED\",\"INVENTORY_UNION_SLOT\",\"INVENTORY_AWEME_FEED\"],\"is_comment_disable\":1, \"web_url\":\"https://www.chengzijianzhan.com/tetris/page/1603850620900366\",\"source\":\"mex测试中国\"}";

        CreativeCreateRequest creativeCreateRequest = JSON.parseObject(data, CreativeCreateRequest.class);
        CreativeCreateResponse res = CreativeApi.create(token, creativeCreateRequest);
        System.out.println("=--------------------");
    }
}