package com.github.toutiao.sdk.api.bean.convert;

import com.github.toutiao.sdk.api.bean.ToutiaoResponse;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * admin
 * on 2018/12/26.
 */
@Data
@Accessors(chain = true)
public class ConvertCreateResponse extends ToutiaoResponse<ConvertCreateResponse.Data> {
    @lombok.Data
    public static class Data {
        private Long id;
        private String opt_status;
        private String status;
    }

}
