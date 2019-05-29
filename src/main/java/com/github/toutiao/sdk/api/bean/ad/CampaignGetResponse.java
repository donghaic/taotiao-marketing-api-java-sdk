package com.github.toutiao.sdk.api.bean.ad;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import com.github.toutiao.sdk.support.Paging;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class CampaignGetResponse extends ToutiaoResponse<CampaignGetResponse.Data> {

    @lombok.Data
    public static class Data {
        List<CampaignInfo> list;
        Paging page_info;
    }

    @lombok.Data
    public static class CampaignInfo extends AdBase {
        Long id;
        Long advertiser_id;
        String name;
        BigDecimal budget;
        String budget_mode;
        String landing_type;
        String modify_time;
        String status;
        String campaign_create_time;
        String campaign_modify_time;
    }

}
