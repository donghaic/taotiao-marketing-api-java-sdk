package com.github.toutiao.sdk.api.bean.agent;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import com.github.toutiao.sdk.support.Paging;
import lombok.Data;

@Data
public class UpdateAdverResponse extends ToutiaoResponse<UpdateAdverResponse.Data> {
    Paging page_info;

    @lombok.Data
    public static class Data {
        Long advertiser_id;
        Long need_audit;
    }
}
