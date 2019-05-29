package com.github.toutiao.sdk.api;

import com.alibaba.fastjson.JSON;
import com.github.toutiao.sdk.api.bean.cashflow.AdverFundDailyRequest;
import com.github.toutiao.sdk.api.bean.cashflow.AdverFundDailyResponse;
import org.junit.Test;

public class CashFlowApiTest {
    String token = "d4051d7bc132929bb223666b399c878dafe8588b";

    @Test
    public void fundDailyReport() {
        AdverFundDailyRequest request = new AdverFundDailyRequest();
        request.setAdvertiser_id(101245130841L);
        request.setStart_date("2019-03-10");
        request.setEnd_date("2019-03-11");
        AdverFundDailyResponse adverFundDailyResponse = CashFlowApi.fundDailyReport(token, request);
        System.out.println(JSON.toJSONString(adverFundDailyResponse));
    }
}