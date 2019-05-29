package com.github.toutiao.sdk.api.bean.query_tool;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

import java.util.List;

@Data
public class QueryAdQualityResponse extends ToutiaoResponse<QueryAdQualityResponse.Data> {

    @lombok.Data
    public static class Data {
        List<Quality> list;
    }

    @lombok.Data
    public static class Quality {
        Long ad_id;
        Float quality_score;
        Float ctr_score;
        Float web_score;
        Float cvr_score;
    }
}
