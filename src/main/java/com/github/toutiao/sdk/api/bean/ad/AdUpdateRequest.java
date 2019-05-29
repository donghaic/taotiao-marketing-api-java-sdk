package com.github.toutiao.sdk.api.bean.ad;

import lombok.Data;

/**
 * admin
 * on 2018/12/26.
 */
@Data
public class AdUpdateRequest extends AdCreateUpdateBase {
    //请求参数
    Long ad_id;
    String modify_time;
}
