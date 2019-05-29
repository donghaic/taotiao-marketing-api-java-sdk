package com.github.toutiao.sdk.api.bean.file;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;


@Data
public class ImageQueryResponse extends ToutiaoResponse<ImageQueryResponse.Data> {

    @lombok.Data
    public static class Data {

    }

    @lombok.Data
    public static class Item {
        String id;
        Integer size;
        Integer width;
        Integer height;
        String url;
        String format;
        String signature;
    }
}
