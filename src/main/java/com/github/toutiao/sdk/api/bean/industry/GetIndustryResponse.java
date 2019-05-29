package com.github.toutiao.sdk.api.bean.industry;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

import java.util.List;

/**
 * admin
 * on 2019/1/22.
 */
@Data
public class GetIndustryResponse extends ToutiaoResponse<GetIndustryResponse.Data> {

    @lombok.Data
    public static class Data {
        List<Industry> industry_list;


    }

    @lombok.Data
    public static class Industry {
        Integer second_industry_id;
        String third_industry_name;
        Integer level;
        Integer industry_id;
        Integer first_industry_id;
        String second_industry_name;
        Integer third_industry_id;
        String first_industry_name;
        String industry_name;
    }
}
