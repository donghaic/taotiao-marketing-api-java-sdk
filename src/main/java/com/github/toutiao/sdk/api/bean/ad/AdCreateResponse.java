package com.github.toutiao.sdk.api.bean.ad;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;


@Data
public class AdCreateResponse extends ToutiaoResponse<AdCreateResponse.Data> {

    @lombok.Data
    public static class Data {
        private Long ad_id;
    }

}
