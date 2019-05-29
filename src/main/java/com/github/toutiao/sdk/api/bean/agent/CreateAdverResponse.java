package com.github.toutiao.sdk.api.bean.agent;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

@Data
public class CreateAdverResponse extends ToutiaoResponse<CreateAdverResponse.Data> {

    @lombok.Data
    public static class Data {
        Long advertiser_id;
    }
}
