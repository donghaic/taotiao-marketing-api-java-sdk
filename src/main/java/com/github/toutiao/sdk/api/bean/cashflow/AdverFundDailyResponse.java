package com.github.toutiao.sdk.api.bean.cashflow;


import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import com.github.toutiao.sdk.support.Paging;
import lombok.Data;



import java.util.List;

@Data
public class AdverFundDailyResponse extends ToutiaoResponse<AdverFundDailyResponse.Data> {

    private Paging page_info;

    @lombok.Data
    public static class Data {
        List<AdverFundDaily> list;
    }

    @lombok.Data
    public static class AdverFundDaily {

        String id;
        Long advertiser_id;
        String date;
        Double balance;
        Double cash_cost;
        Double cost;
        Double frozen;
        Double grant;
        Double income;
        Double reward_cost;
        Double return_goods_cost;
        Double transfer_in;
        Double transfer_out;
        Long adverid;
        Long agentid;
        String updateTime;
        Boolean fix;

        String adverName;
        String companyName;
        String adverType;
    }
}
