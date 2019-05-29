package com.github.toutiao.sdk.api.bean.report;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

import java.util.List;

@Data
public class ReportCampaignResponse extends ToutiaoResponse<ReportCampaignResponse.Data> {

    @lombok.Data
    public static class Data {
        List<ReportCampaign> list;
    }

    @lombok.Data
    public static class ReportCampaign extends ReportBase {

        String _id;
        Long campaign_id;

        String landing_type;
        String status;
        Long campaignid;
        String name;
        Boolean fix;
    }
}
