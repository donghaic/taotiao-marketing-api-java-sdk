package com.github.toutiao.sdk.api;

import com.google.common.collect.ImmutableList;
import com.github.toutiao.sdk.api.bean.advertiser.AdvertiserInfoResponse;
import com.github.toutiao.sdk.api.bean.agent.ListAdverResponse;
import com.github.toutiao.sdk.api.bean.agent.ListChildResponse;
import com.github.toutiao.sdk.support.ToutiaoRestException;
import org.junit.Test;

import java.util.List;

public class AgentApiTest extends TouTaioTestBase {

    @Test
    public void listAdver() throws ToutiaoRestException {
        String token = "8c737ede48f54384b8f32d4ab1e8dfec345207c2";
        ListAdverResponse listAdverResponse = AgentApi.listAdver(token, 1, 100);
        System.out.println(listAdverResponse.toJSON());
    }

    @Test
    public void listAdverUI() throws ToutiaoRestException {
        String token = "8c737ede48f54384b8f32d4ab1e8dfec345207c2";
        ListAdverResponse listAdverResponse = AgentApi.listAdver(token, 1, 100);
        System.out.println(listAdverResponse.toJSON());
        List<Long> advids = listAdverResponse.getData().getAdvertiser_ids();
        for (Long adv : advids) {
            AdvertiserInfoResponse info = AdvertiserApi.getInfo(token, ImmutableList.of(adv), null);
        }
    }

    @Test
    public void createAdver() {
    }

    @Test
    public void updateAdver() {
    }

    @Test
    public void listChild() throws ToutiaoRestException {
        String token = "b8cc24ac1f832b86bf4814faf029d0bf2b0edab1";
        ListChildResponse childResponse = AgentApi.listChild(token, 1, 10);
        System.out.println(childResponse.toJSON());
    }

    @Test
    public void transferAdver() {
    }

    @Test
    public void refundAdver() {
    }
}
