package com.github.toutiao.sdk.api.bean.query_tool;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class QueryPredictTaResponse extends ToutiaoResponse<QueryPredictTaResponse.Data> {
    @lombok.Data
    @Accessors(chain = true)
    public static class Data {
        // 抖音视频预估用户覆盖量结果
        TaType aweme;
        // 火山视频预估用户覆盖量结果
        TaType hotsoon;
        // 西瓜视频预估用户覆盖量结果
        TaType video_app;
        //今日头条预估用户覆盖量结果
        TaType toutiao;
    }

    @lombok.Data
    @Accessors(chain = true)
    public static class TaType {
        Long num;
    }

}
