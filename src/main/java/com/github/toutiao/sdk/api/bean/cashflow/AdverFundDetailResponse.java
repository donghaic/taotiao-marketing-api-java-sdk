package com.github.toutiao.sdk.api.bean.cashflow;


import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import com.github.toutiao.sdk.support.Paging;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class AdverFundDetailResponse extends ToutiaoResponse<AdverFundDetailResponse.Data> {

    private Paging page_info;

    @lombok.Data
    public static class Data {
        List<Report> list;
    }

    @lombok.Data
    public static class Report {
        Long advertiser_id;
        String transaction_type;
        String create_time;
        BigDecimal grant;
        BigDecimal frozen;
        BigDecimal cash;
        BigDecimal dealbase;
        BigDecimal amount;
        BigDecimal return_goods;
        BigDecimal transaction_seq;
        BigDecimal remitter;
        BigDecimal payee;

    }
}
