package com.github.toutiao.sdk.api.bean.industry;

import com.github.toutiao.sdk.api.bean.BaseModel;
import lombok.Data;

/**
 * admin
 * on 2019/1/22.
 */
@Data
public class GetIndustryRequest extends BaseModel {
    Integer level;

    public String toQueryString() {
        StringBuilder builder = new StringBuilder();
        builder.append("?level=").append(level);
        return builder.toString();
    }
}
