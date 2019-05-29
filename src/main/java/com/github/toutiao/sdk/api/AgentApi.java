package com.github.toutiao.sdk.api;

import com.github.toutiao.sdk.api.bean.agent.*;
import com.github.toutiao.sdk.support.HttpMethod;
import com.github.toutiao.sdk.support.ToutiaoResource;
import com.github.toutiao.sdk.support.ToutiaoRestException;
import com.github.toutiao.sdk.support.UrlConst;

import java.util.Objects;

public class AgentApi extends ToutiaoResource {

    public static ListAdverResponse listAdver(String token, Integer page, Integer pageSize) throws ToutiaoRestException {
        page = Objects.isNull(page) ? 1 : page;
        pageSize = Objects.isNull(pageSize) ? 10 : pageSize;
        String url = String.format(UrlConst.AGENT_ADVER_LIST_URL, page, pageSize);
        return execute(HttpMethod.GET, url, "", ListAdverResponse.class, token);
    }

    public static CreateAdverResponse createAdver(String token, CreateAdverRequest request) throws ToutiaoRestException {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.AGENT_ADVER_CREATE_URL, payload, CreateAdverResponse.class, token);
    }

    public static UpdateAdverResponse updateAdver(String token, UpdateAdverRequest request) throws ToutiaoRestException {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.AGENT_ADVER_UPDATE_URL, payload, UpdateAdverResponse.class, token);
    }

    public static ListChildResponse listChild(String token, Integer page, Integer pageSize) throws ToutiaoRestException {
        page = Objects.isNull(page) ? 1 : page;
        pageSize = Objects.isNull(pageSize) ? 10 : pageSize;
        String url = String.format(UrlConst.AGENT_CHILD_LIST_URL, page, pageSize);
        return execute(HttpMethod.GET, url, "", ListChildResponse.class, token);
    }


}
