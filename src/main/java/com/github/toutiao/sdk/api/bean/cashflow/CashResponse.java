package com.github.toutiao.sdk.api.bean.cashflow;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

@Data
public class CashResponse extends ToutiaoResponse<CashResponse.Data> {

    @lombok.Data
    public static class Data {
        String transaction_seq;
    }
}
