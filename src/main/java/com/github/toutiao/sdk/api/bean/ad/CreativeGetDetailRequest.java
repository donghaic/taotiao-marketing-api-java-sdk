package com.github.toutiao.sdk.api.bean.ad;

import com.github.toutiao.sdk.api.bean.BaseModel;
import lombok.Data;

@Data
public class CreativeGetDetailRequest extends BaseModel {
    Long advertiser_id;
    Long ad_id;


    public String toQueryString() {
        StringBuilder builder = new StringBuilder();
        builder.append("?advertiser_id=").append(advertiser_id);
        builder.append("&ad_id=").append(ad_id);
        return builder.toString();
    }
}
