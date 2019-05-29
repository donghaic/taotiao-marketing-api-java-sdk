package com.github.toutiao.sdk.api.bean.dmp;

import lombok.Data;

import java.io.File;

@Data
public class DataSourceUploadRequest {
    Long advertiser_id;
    File file;
    String file_signature;
}
