package com.github.toutiao.sdk.api;

import com.github.toutiao.sdk.api.bean.creative_word.*;
import com.github.toutiao.sdk.support.HttpMethod;
import com.github.toutiao.sdk.support.ToutiaoResource;
import com.github.toutiao.sdk.support.ToutiaoRestException;
import com.github.toutiao.sdk.support.UrlConst;

public class CreativeWordApi extends ToutiaoResource {

    public static WordQueryResponse query(String token, WordQueryRequest request) throws ToutiaoRestException {
        String url = UrlConst.CREATIVE_WORD_SELECT_URL + "?" + request.toQueryString();
        return execute(HttpMethod.GET, url, "", WordQueryResponse.class, token);
    }

    public static WordCreateResponse create(String token, WordCreateRequest request) throws ToutiaoRestException {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.CREATIVE_WORD_CREATE_URL, payload, WordCreateResponse.class, token);
    }

    public static WordDeleteResponse delete(String token, WordDeleteRequest request) throws ToutiaoRestException {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.CREATIVE_WORD_DELETE_URL, payload, WordDeleteResponse.class, token);
    }

    public static WordUpdateResponse update(String token, WordUpdateRequest request) throws ToutiaoRestException {
        String payload = request.toJSON();
        return execute(HttpMethod.POST, UrlConst.CREATIVE_WORD_UPDATE_URL, payload, WordUpdateResponse.class, token);
    }


}
