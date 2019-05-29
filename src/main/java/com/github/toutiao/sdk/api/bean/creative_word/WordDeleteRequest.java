package com.github.toutiao.sdk.api.bean.creative_word;

import com.github.toutiao.sdk.api.bean.BaseModel;
import lombok.Data;

@Data
public class WordDeleteRequest extends BaseModel {
    Long advertiser_id;
    Long creative_word_id;
}
