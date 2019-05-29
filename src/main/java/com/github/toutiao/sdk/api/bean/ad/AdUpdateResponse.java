package com.github.toutiao.sdk.api.bean.ad;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

@Data
public class AdUpdateResponse extends ToutiaoResponse<AdUpdateResponse.Data> {

    @lombok.Data
    public static class Data {
        Long ad_id;
        Long need_audit;
    }

}
