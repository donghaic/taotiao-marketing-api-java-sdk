package com.github.toutiao.sdk.api.bean.file;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

@Data
public class VideoCoverImgResponse extends ToutiaoResponse<VideoCoverImgResponse.Image> {

    @Data
    public static class Image {
        String url;
        Integer width;
        Integer height;
        String id;
    }
}
