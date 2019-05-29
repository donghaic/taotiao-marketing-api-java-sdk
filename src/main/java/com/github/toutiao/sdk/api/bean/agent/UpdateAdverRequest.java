package com.github.toutiao.sdk.api.bean.agent;

import com.github.toutiao.sdk.api.bean.BaseModel;
import lombok.Data;

@Data
public class UpdateAdverRequest extends BaseModel {
    private Long advertiser_id;
    private String name;
    private String contacter;
    private String phonenumber;
    private String telephone;
}
