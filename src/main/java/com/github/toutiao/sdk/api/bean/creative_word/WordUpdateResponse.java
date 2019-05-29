package com.github.toutiao.sdk.api.bean.creative_word;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import com.github.toutiao.sdk.api.bean.file.ImageQueryResponse;
import lombok.Data;

@Data
public class WordUpdateResponse extends ToutiaoResponse<ImageQueryResponse.Data> {

    @lombok.Data
    public static class Data {
        String creative_word_id;
    }
}
