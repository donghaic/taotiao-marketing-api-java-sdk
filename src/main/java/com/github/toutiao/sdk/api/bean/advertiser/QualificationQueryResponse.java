package com.github.toutiao.sdk.api.bean.advertiser;


import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

import java.util.List;

@Data
public class QualificationQueryResponse extends ToutiaoResponse<QualificationQueryResponse.Data> {

    @lombok.Data
    public static class Data {
        List<Qualification> list;
    }

    @lombok.Data
    public static class Qualification {
        Long qualification_id;
        String qualification_type;
        String description;
    }
}
