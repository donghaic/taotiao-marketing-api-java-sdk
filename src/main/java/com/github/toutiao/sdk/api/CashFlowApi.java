package com.github.toutiao.sdk.api;

import com.github.toutiao.sdk.api.bean.cashflow.*;
import com.github.toutiao.sdk.support.HttpMethod;
import com.github.toutiao.sdk.support.ToutiaoResource;
import com.github.toutiao.sdk.support.ToutiaoRestException;
import com.github.toutiao.sdk.support.UrlConst;

public class CashFlowApi extends ToutiaoResource {

    public static CashResponse transferAdver(String token, CashRequest request) throws ToutiaoRestException {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.AGENT_TRANSFER_URL, payload, CashResponse.class, token);
    }

    public static CashResponse refundAdver(String token, CashRequest request) throws ToutiaoRestException {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.AGENT_REFUND_URL, payload, CashResponse.class, token);
    }

    public static AdverBalanceQueryResponse adverBalanceGet(String token, Long advertiserId) throws ToutiaoRestException {
        String url = String.format(UrlConst.ADVER_FOUND_BALANCE_URL, advertiserId);
        return execute(HttpMethod.GET, url, "", AdverBalanceQueryResponse.class, token);
    }


    public static AdverFundDailyResponse fundDailyReport(String token, AdverFundDailyRequest request) throws ToutiaoRestException {
        String url = UrlConst.ADVER_FOUND_DAILY_REPORT_URL + request.toQueryString();
        return execute(HttpMethod.GET, url, "", AdverFundDailyResponse.class, token);
    }

    public static AdverFundDetailResponse fundTransaction(String token, AdverFundDetailRequest request) throws ToutiaoRestException {
        String url = UrlConst.ADVER_FOUND_TRANX_DETAIL_URL + request.toQueryString();
        return execute(HttpMethod.GET, url, "", AdverFundDetailResponse.class, token);
    }
}
