package com.github.toutiao.sdk.api.bean.advertiser;


import com.github.toutiao.sdk.api.bean.BaseModel;
import lombok.Data;

@Data
public class QualificationDeleteRequest extends BaseModel {
    Long advertiser_id;
    Long qualification_id;
}
