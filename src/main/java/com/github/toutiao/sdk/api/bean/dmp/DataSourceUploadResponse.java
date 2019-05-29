package com.github.toutiao.sdk.api.bean.dmp;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

@Data
public class DataSourceUploadResponse extends ToutiaoResponse<DataSourceUploadResponse.Data> {
    @lombok.Data
    public static class Data {
        String file_path;
    }
}
