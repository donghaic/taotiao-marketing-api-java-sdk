package com.github.toutiao.sdk.api.bean.report;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

import java.util.List;

@Data
public class ReportAdverResponse extends ToutiaoResponse<ReportAdverResponse.Data> {

    @lombok.Data
    public static class Data {
        List<ReportAdvertiser> list;
    }

    @lombok.Data
    public static class ReportAdvertiser extends ReportBase {

        String _id;
        String name;
        String company;
        Long advertiser_id;
        Boolean hasData;
        Boolean fix;
    }
}
