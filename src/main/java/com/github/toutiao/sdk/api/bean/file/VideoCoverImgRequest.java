package com.github.toutiao.sdk.api.bean.file;

import lombok.Data;

@Data
public class VideoCoverImgRequest {
    Long advertiser_id;
    String video_id;

    public String toQueryString() {
        return "advertiser_id=" + advertiser_id + "&video_id=" + video_id;
    }
}
