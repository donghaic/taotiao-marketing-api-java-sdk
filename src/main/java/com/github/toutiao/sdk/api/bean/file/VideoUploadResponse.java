package com.github.toutiao.sdk.api.bean.file;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;


@Data
public class VideoUploadResponse extends ToutiaoResponse<VideoUploadResponse.Data> {
    public static final VideoUploadResponse EMPTY = new VideoUploadResponse();
    @lombok.Data
    public static class Data {
        String video_id;
    }
}
