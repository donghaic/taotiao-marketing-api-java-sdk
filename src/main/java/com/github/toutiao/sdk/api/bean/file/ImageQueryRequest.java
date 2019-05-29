package com.github.toutiao.sdk.api.bean.file;

import com.alibaba.fastjson.JSON;
import com.github.toutiao.sdk.api.bean.BaseModel;
import com.github.toutiao.sdk.support.utils.URIUtil;
import lombok.Data;

import java.util.List;

@Data
public class ImageQueryRequest extends BaseModel {
    Long advertiser_id;
    List<String> image_ids;

    public String toQueryString() {
        return "advertiser_id=" + advertiser_id + "&image_ids=" + URIUtil.encodeURIComponent(JSON.toJSONString(image_ids));
    }
}
