package com.github.toutiao.sdk.api.bean.ad;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;

@Data
public class CreativeGetDetailResponse extends ToutiaoResponse<CreativeGetDetailResponse.CreativeInfos> {

    @lombok.Data
    public static class CreativeInfos extends CreativeInfoBase {
        String modify_time;
        Long adverid;
        Long adid;
        Long agentid;
        String updateTime;
    }
}
