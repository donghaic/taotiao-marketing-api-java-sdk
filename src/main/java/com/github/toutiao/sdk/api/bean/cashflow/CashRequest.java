package com.github.toutiao.sdk.api.bean.cashflow;

import com.github.toutiao.sdk.api.bean.BaseModel;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CashRequest extends BaseModel {
    private Long advertiser_id;
    private BigDecimal amount;
}
