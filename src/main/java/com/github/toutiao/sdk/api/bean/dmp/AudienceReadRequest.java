package com.github.toutiao.sdk.api.bean.dmp;

import com.alibaba.fastjson.JSON;
import com.github.toutiao.sdk.support.utils.URIUtil;
import lombok.Data;

import java.util.List;

@Data
public class AudienceReadRequest {
    Long advertiser_id;
    List<Long> custom_audience_ids;

    public String toQueryString() {
        return "advertiser_id=" + advertiser_id + "&custom_audience_ids=" + URIUtil.encodeURIComponent(JSON.toJSONString(custom_audience_ids));
    }
}
