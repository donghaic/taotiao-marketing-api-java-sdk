package com.github.toutiao.sdk.support;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ToutiaoConfig {
    private String appId;
    private String appSecret;
    private String redirectUrl;
    private String welcomeUrl;
}
