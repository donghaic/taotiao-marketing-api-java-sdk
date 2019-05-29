package com.github.toutiao.sdk.api.bean.dmp;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

import java.util.List;

@Data
public class AudienceDetailResponse extends ToutiaoResponse<AudienceDetailResponse.Data> {

    @lombok.Data
    public static class Data {
        List<Audience> custom_audience_list;
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
        Integer create_time;
        Integer modify_time;

    }
}
