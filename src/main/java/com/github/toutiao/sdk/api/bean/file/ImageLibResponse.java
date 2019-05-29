package com.github.toutiao.sdk.api.bean.file;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

@Data
public class ImageLibResponse extends ToutiaoResponse<ImageQueryResponse.Data> {

    @lombok.Data
    public static class Data {
        String id;
        Integer size;
        Integer width;
        Integer height;
        String url;
        String format;
        String signature;
        Integer page;
        Integer page_size;
        Integer total_page;
        Integer total_number;
    }
}
