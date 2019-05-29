package com.github.toutiao.sdk.api.bean.creative_word;

import com.github.toutiao.sdk.api.bean.BaseModel;
import lombok.Data;

import java.util.List;

@Data
public class WordCreateRequest extends BaseModel {
    Long advertiser_id;
    String name;
    String default_word;
    List<String> words;
}
