package com.github.toutiao.sdk.api.bean.ad;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

@Data
public class CampaignCreateResponse extends ToutiaoResponse<CampaignCreateResponse.Data> {

    @lombok.Data
    public static class Data {
        Long campaign_id;
    }

}
