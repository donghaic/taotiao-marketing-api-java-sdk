package com.github.toutiao.sdk.api.bean.creative_word;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

import java.util.List;

@Data
public class WordQueryResponse extends ToutiaoResponse<WordQueryResponse.Data> {

    @lombok.Data
    public static class Data {
        List<Words> creative_word;
    }

    @lombok.Data
    public static class Words {
        Long creative_word_id;
        String name;
        String default_word;
        List<String> words;
        String content_type;
        Integer max_word_len;
        String status;
        Float user_rate;
    }
}
