package com.github.toutiao.sdk.api;


import com.github.toutiao.sdk.support.ToutiaoConfig;

public class TouTaioTestBase {
    static ToutiaoConfig conf;

    static {
        conf = new ToutiaoConfig();
        conf.setAppId("XXXXXXXXXXXXXXXXXXXXXXXXXXXx");
        conf.setAppSecret("XXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
}
