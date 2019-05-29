package com.github.toutiao.sdk.api.bean.auth;

import com.alibaba.fastjson.JSON;
import org.junit.Before;
import org.junit.Test;

public class AccessTokenResponseTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void json() throws Exception {
        AccessTokenResponse.Data data = new AccessTokenResponse.Data();
        data.setAccess_token("token-123");
        data.setAdvertiser_id(11L);
        data.setExpires_in(10000L);
        data.setRefresh_token("1-00000");

        AccessTokenResponse response = new AccessTokenResponse();
        response.setCode(1);
        response.setMessage("hello");
        response.setRequest_id("req-1235");
        response.setData(data);

        String s = JSON.toJSONString(response);
        AccessTokenResponse response1 = JSON.parseObject(s, AccessTokenResponse.class);
        System.out.println("OK");
    }
}