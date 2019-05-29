package com.github.toutiao.sdk.api.bean.convert;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.experimental.Accessors;

import java.util.List;

@lombok.Data
@Accessors(chain = true)
public class ConvertQueryAvailableConvertIdResponse extends ToutiaoResponse<ConvertQueryAvailableConvertIdResponse.Data> {

    @lombok.Data
    public static class Data {
        List<ActiveConvert> active_convert_list;
    }

    @lombok.Data
    public static class ActiveConvert {
        Long id;
        String name;
        String convert_source_type;
        String convert_type;
        String action_track_url;
    }

}
