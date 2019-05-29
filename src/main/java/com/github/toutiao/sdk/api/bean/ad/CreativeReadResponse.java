package com.github.toutiao.sdk.api.bean.ad;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;
import lombok.experimental.Accessors;



import java.util.List;

@Data
public class CreativeReadResponse extends ToutiaoResponse<List<CreativeReadResponse.CreativeInfo>> {


    @Data
    public static class CreativeInfo extends AdBase {
        String _id;
        Long id;
        Long ad_id;
        Long advertiser_id;
        String title;
        String status;
        String opt_status;
        String image_mode;
        List<ImageInfo> image_info;
        Long campid;
        String landing_type;
    }

    @Data
    @Accessors(chain = true)
    public static class ImageInfo {
        private Integer height;
        private String url;
        private Integer width;
    }


}
