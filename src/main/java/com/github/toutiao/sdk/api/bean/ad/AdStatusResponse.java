package com.github.toutiao.sdk.api.bean.ad;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

import java.util.List;

@Data
public class AdStatusResponse extends ToutiaoResponse<AdStatusResponse.Data> {

    @lombok.Data
    public static class Data {
        List<Long> ad_ids;
    }

}
