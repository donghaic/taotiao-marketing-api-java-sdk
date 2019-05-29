package com.github.toutiao.sdk.api.bean.query_tool;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

import java.util.List;

@Data
public class QueryIndustryResponse extends ToutiaoResponse<QueryIndustryResponse.Data> {

    @lombok.Data
    public static class Data {
        List<Industry> industry_list;
    }

    @lombok.Data
    public static class Industry {
        Long industry_id;
        String industry_name;
        Integer level;
        Long first_industry_id;
        String first_industry_name;
        Long second_industry_id;
        String second_industry_name;
    }
}
