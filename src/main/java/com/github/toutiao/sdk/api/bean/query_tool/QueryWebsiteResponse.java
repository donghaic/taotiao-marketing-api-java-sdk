package com.github.toutiao.sdk.api.bean.query_tool;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

import java.util.List;

@Data
public class QueryWebsiteResponse extends ToutiaoResponse<QueryWebsiteResponse.Data> {

    @lombok.Data
    public static class Data {
        List<WebsiteInfo> list;
        PageInfo page_info;
    }

    @lombok.Data
    public static class WebsiteInfo {
        String siteId;
        String name;
        String status;
        String siteType;
        String thumbnail;
    }

    @lombok.Data
    public static class PageInfo {
        Integer page_size;
        Integer page;
        Integer total_number;
        Integer total_page;
    }
}
