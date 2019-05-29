package com.github.toutiao.sdk.api.bean.dmp;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

@Data
public class DataSourceUpdateResponse extends ToutiaoResponse<DataSourceUpdateResponse.Data> {

    @lombok.Data
    public static class Data {
        String data_source_id;
    }
}
