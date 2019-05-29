package com.github.toutiao.sdk.api.bean.agent;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import com.github.toutiao.sdk.support.Paging;
import lombok.Data;

import java.util.List;

@Data
public class ListAdverResponse extends ToutiaoResponse<ListAdverResponse.Data> {
    Paging page_info;

    @lombok.Data
    public static class Data {
        List<Long> advertiser_ids;
    }
}
