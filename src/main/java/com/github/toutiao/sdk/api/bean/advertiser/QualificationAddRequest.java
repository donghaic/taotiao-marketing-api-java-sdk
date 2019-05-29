package com.github.toutiao.sdk.api.bean.advertiser;


import com.github.toutiao.sdk.api.bean.BaseModel;
import lombok.Data;

@Data
public class QualificationAddRequest extends BaseModel {

    Long advertiser_id;
    String qualification_type;
    Long qualification_id;

}
