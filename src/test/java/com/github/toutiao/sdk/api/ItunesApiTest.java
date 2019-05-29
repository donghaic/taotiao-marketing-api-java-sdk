package com.github.toutiao.sdk.api;

import com.github.toutiao.sdk.api.bean.itunes.ITunesAppInfo;
import org.junit.Test;

public class ItunesApiTest {

    @Test
    public void lookup() {
        ITunesAppInfo iTunesAppInfo = ItunesApi.lookup("https://itunes.apple.com/cn/app/id1411829486?mt=8");
        System.out.println("OK");
    }
}