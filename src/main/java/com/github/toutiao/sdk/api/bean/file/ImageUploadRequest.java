package com.github.toutiao.sdk.api.bean.file;

import com.github.toutiao.sdk.api.bean.ToutiaoRequest;
import lombok.Data;

import java.io.File;

@Data
public class ImageUploadRequest  extends ToutiaoRequest<ImageUploadRequest> {
    Long advertiser_id;
    String upload_type;
    String image_signature;
    File image_file;
    String image_url;
}
