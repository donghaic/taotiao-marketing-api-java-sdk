package com.github.toutiao.sdk.api.bean.advertiser;


import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

import java.util.List;

@Data
public class AdverPublicInfoResponse extends ToutiaoResponse<List<AdverPublicInfoResponse.Data>> {

    @lombok.Data
    public static class Data {
        private Long id;
        private String name;
        private String company;
    }

}
