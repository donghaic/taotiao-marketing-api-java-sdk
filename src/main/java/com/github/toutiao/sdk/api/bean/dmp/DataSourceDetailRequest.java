package com.github.toutiao.sdk.api.bean.dmp;

import com.alibaba.fastjson.JSON;
import com.github.toutiao.sdk.api.bean.BaseModel;
import com.github.toutiao.sdk.support.utils.URIUtil;
import lombok.Data;

import java.util.List;

@Data
public class DataSourceDetailRequest extends BaseModel {
    Long advertiser_id;
    List<String> data_source_id_list;

    public String queryString() {
        return "advertiser_id=" + advertiser_id + "&data_source_id_list=" + URIUtil.encodeURIComponent(JSON.toJSONString(data_source_id_list));
    }
}
