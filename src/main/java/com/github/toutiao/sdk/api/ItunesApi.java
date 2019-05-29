package com.github.toutiao.sdk.api;

import com.alibaba.fastjson.JSON;
import com.github.toutiao.sdk.api.bean.itunes.ITunesAppInfo;
import com.github.toutiao.sdk.support.HttpMethod;
import com.github.toutiao.sdk.support.ToutiaoResource;
import lombok.extern.slf4j.Slf4j;

/**
 * 应用上传相关
 */
public class ItunesApi extends ToutiaoResource {
    static String ITUNES_LOOKUP_URL = "https://itunes.apple.com/cn/lookup?id=%s&entity=album";

    public static ITunesAppInfo lookup(String appUrl) {
        String[] ids = appUrl.split("id");
        String[] split = ids[1].split("\\?");
        String url = String.format(ITUNES_LOOKUP_URL, split[0]);

        String appInfoString = request(HttpMethod.GET, url, null, null);
        return JSON.parseObject(appInfoString, ITunesAppInfo.class);
    }

}
