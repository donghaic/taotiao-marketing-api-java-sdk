package com.github.toutiao.sdk.api.bean.dmp;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

@Data
public class AudienceLookalikeResponse extends ToutiaoResponse<AudienceLookalikeResponse.Data> {
    @lombok.Data
    public static class Data {
        Long custom_audience_id;
    }
}
