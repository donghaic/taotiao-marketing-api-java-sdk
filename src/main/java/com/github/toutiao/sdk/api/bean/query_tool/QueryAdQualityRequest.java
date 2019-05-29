package com.github.toutiao.sdk.api.bean.query_tool;

import com.alibaba.fastjson.JSON;
import com.github.toutiao.sdk.support.utils.URIUtil;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class QueryAdQualityRequest {
    Long advertiser_id;
    List<Long> ad_ids;

    public String toQueryString() {
        return "advertiser_id=" + advertiser_id + "&ad_ids=" + URIUtil.encodeURIComponent(JSON.toJSONString(ad_ids));
    }
}
