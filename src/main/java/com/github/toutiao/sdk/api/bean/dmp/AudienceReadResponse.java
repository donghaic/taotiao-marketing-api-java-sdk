package com.github.toutiao.sdk.api.bean.dmp;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

import java.util.List;

@Data
public class AudienceReadResponse extends ToutiaoResponse<AudienceReadResponse.Data> {

    @lombok.Data
    public static class Data {
        List<AudienceDetailResponse.Audience> custom_audience_list;
    }

    @lombok.Data
    public static class Audience {
        Long custom_audience_id;
        String data_source_id;
        String isdel;
        String name;
        String source;
        String status;
        String tag;
        String upload_num;
        String cover_num;

    }
}
