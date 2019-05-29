package com.github.toutiao.sdk.api.bean.report;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;




import java.util.List;

@Data
public class ReportAdResponse extends ToutiaoResponse<ReportAdResponse.Data> {

    @lombok.Data
    public static class Data {
        List<ReportAd> list;
    }

    @lombok.Data
    public static class ReportAd extends ReportBase {

        String _id;
        Long ad_id;


        String pricing;
        String status;
        Long adid;
        String name;
        Boolean fix;



    }
}
