package com.github.toutiao.sdk.api.bean.convert;

import com.github.toutiao.sdk.api.bean.BaseModel;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ConvertDetailRequest extends BaseModel {
    Long advertiser_id;
    Long convert_id;

    public String toQueryString() {
        return "advertiser_id=" + advertiser_id + "&convert_id=" + convert_id;
    }
}
