package com.github.toutiao.sdk.api.bean.file;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

@Data
public class VideoQueryResponse extends ToutiaoResponse<VideoQueryResponse.Image> {

    @Data
    public static class Image {
        Integer size;
        Integer width;
        Integer height;
        String format;
        String url;
        String signature;
        String poster_url;
        Integer bit_rate;
        Integer duration;
        String id;
    }
}
