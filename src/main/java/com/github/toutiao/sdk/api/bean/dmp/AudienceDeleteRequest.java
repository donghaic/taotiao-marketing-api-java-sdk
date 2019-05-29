package com.github.toutiao.sdk.api.bean.dmp;

import com.github.toutiao.sdk.api.bean.BaseModel;

import lombok.Data;

@Data
public class AudienceDeleteRequest extends BaseModel {
    String id;
    // "广告主ID")
    Long advertiser_id;
    // "人群包ID")
    Long custom_audience_id;
}
