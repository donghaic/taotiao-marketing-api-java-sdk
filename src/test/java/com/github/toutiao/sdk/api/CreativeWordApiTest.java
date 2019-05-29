package com.github.toutiao.sdk.api;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.ImmutableList;
import com.github.toutiao.sdk.api.bean.creative_word.*;
import org.junit.Test;

public class CreativeWordApiTest {
    String token = "f3ed0e23e4731b722f1c8f4ea21420f42e35fd3a";

    @Test
    public void query() {
        WordQueryRequest request = new WordQueryRequest();
        request.setAdvertiser_id(103779788747L);
        WordQueryResponse response = CreativeWordApi.query(token, request);
        System.out.println(JSON.toJSONString(response.getData()));
    }

    @Test
    public void create() {
        WordCreateRequest request = new WordCreateRequest();
        request.setAdvertiser_id(99018847074L);
        request.setName("api测试");
        request.setDefault_word("测试");
        request.setWords(ImmutableList.of("测试1", "测试2", "测试3"));
        WordCreateResponse response = CreativeWordApi.create(token, request);
        System.out.println(JSON.toJSONString(response.getData()));
    }

    @Test
    public void delete() {
        WordDeleteRequest request = new WordDeleteRequest();
        request.setAdvertiser_id(99018847074L);
        request.setCreative_word_id(8134L);
        WordDeleteResponse response = CreativeWordApi.delete(token, request);
        System.out.println("----");
    }

    @Test
    public void update() {
        WordUpdateRequest request = new WordUpdateRequest();
        request.setAdvertiser_id(99018847074L);
        request.setCreative_word_id(8134L);
        request.setName("api测试2");
        request.setDefault_word("测试2");
        request.setWords(ImmutableList.of("测试1", "测试2", "测试3", "测试4"));
        WordUpdateResponse response = CreativeWordApi.update(token, request);
        System.out.println("----");
    }
}