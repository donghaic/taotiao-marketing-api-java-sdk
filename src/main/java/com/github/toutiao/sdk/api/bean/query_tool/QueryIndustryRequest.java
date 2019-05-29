package com.github.toutiao.sdk.api.bean.query_tool;

import lombok.Data;

import java.util.Objects;

@Data
public class QueryIndustryRequest {
    Integer level;

    public String toQueryString() {
        if (Objects.nonNull(level)) {
            return "level=" + level;
        } else {
            return "";
        }
    }
}
