package com.github.toutiao.sdk.api.bean.dmp;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

@Data
public class AudienceRuleResponse extends ToutiaoResponse<AudienceRuleResponse.Data> {
    @lombok.Data
    public static class Data {
        Long custom_audience_id;
    }
}
