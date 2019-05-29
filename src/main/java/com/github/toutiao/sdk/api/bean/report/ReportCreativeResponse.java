package com.github.toutiao.sdk.api.bean.report;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

import java.util.List;

@Data
public class ReportCreativeResponse extends ToutiaoResponse<ReportCreativeResponse.Data> {

    @lombok.Data
    public static class Data {
        List<ReportCreative> list;
    }

    @lombok.Data
    public static class ReportCreative extends ReportBase {
        String _id;
        Long creative_id;
        List<String> inventory_type;
        Long creativeid;
        String title;
        Boolean fix;

    }
}
