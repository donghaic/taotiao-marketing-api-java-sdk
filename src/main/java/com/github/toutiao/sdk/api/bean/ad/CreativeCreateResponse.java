package com.github.toutiao.sdk.api.bean.ad;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;


@Data
public class CreativeCreateResponse extends ToutiaoResponse<CreativeCreateResponse.Data> {

    @lombok.Data
    public static class Data extends CreativeGetDetailResponse.CreativeInfos {

    }
}
