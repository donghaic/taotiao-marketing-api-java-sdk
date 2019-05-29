package com.github.toutiao.sdk.api.bean.ad;

import com.github.toutiao.sdk.api.bean.BaseModel;
import lombok.Data;

import java.util.List;

@Data
public class AdStatusRequest extends BaseModel {
    private Long advertiser_id;
    private List<Long> ad_ids;
    private String opt_status;
}
