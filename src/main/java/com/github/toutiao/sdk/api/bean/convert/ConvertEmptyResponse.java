package com.github.toutiao.sdk.api.bean.convert;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.experimental.Accessors;

@lombok.Data
@Accessors(chain = true)
public class ConvertEmptyResponse extends ToutiaoResponse<ConvertEmptyResponse.Data> {

    @lombok.Data
    public static class Data {

    }
}
