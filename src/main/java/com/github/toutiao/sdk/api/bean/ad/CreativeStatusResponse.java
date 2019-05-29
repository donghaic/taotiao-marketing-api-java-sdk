package com.github.toutiao.sdk.api.bean.ad;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

import java.util.List;

@Data
public class CreativeStatusResponse extends ToutiaoResponse<CreativeStatusResponse.Data> {

    @lombok.Data
    public static class Data {
        List<Long> creative_ids;
    }

}
