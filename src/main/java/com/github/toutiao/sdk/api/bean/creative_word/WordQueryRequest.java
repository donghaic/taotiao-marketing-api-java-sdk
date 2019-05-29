package com.github.toutiao.sdk.api.bean.creative_word;

import com.alibaba.fastjson.JSON;
import com.github.toutiao.sdk.api.bean.BaseModel;
import com.github.toutiao.sdk.support.utils.URIUtil;
import lombok.Data;

import java.util.List;
import java.util.Objects;

@Data
public class WordQueryRequest extends BaseModel {
    Long advertiser_id;
    List<Long> creative_word_ids;

    public String toQueryString() {
        String url = "advertiser_id=" + advertiser_id;
        if (Objects.nonNull(creative_word_ids)) {
            url = url + "&creative_word_ids=" + URIUtil.encodeURIComponent(JSON.toJSONString(creative_word_ids));
        }
        return url;
    }
}
