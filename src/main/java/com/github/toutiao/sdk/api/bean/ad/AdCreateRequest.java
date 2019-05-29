package com.github.toutiao.sdk.api.bean.ad;

import lombok.Data;


@Data
public class AdCreateRequest extends AdCreateUpdateBase {
    private Long campaign_id;
}
