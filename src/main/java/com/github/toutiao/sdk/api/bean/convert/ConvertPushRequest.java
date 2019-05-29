package com.github.toutiao.sdk.api.bean.convert;

import com.github.toutiao.sdk.api.bean.BaseModel;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class ConvertPushRequest extends BaseModel {
    Long advertiser_id;
    Long convert_id;
    List<Long> target_advertiser_ids;
}
