package com.github.toutiao.sdk.api.bean.file;

import com.github.toutiao.sdk.api.bean.ToutiaoRequest;
import lombok.Data;

import java.io.File;

@Data
public class VideoUploadRequest extends ToutiaoRequest<VideoUploadRequest> {
    Long advertiser_id;
    String video_signature;
    File video_file;
}
