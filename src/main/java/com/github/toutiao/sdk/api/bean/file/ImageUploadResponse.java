package com.github.toutiao.sdk.api.bean.file;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

@Data

public class ImageUploadResponse extends ToutiaoResponse<ImageUploadResponse.Image> {
    public final static ImageUploadResponse EMPTY = new ImageUploadResponse();

    @lombok.Data
    public static class Image {
        Integer size;
        Integer width;
        Integer height;
        String format;
        String url;
        String signature;
        String id;
    }
}
