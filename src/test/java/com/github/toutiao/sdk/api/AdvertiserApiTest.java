package com.github.toutiao.sdk.api;

import com.github.toutiao.sdk.api.bean.advertiser.AdvertiserInfoResponse;
import com.github.toutiao.sdk.api.bean.advertiser.UpdateBudgetRequest;
import com.github.toutiao.sdk.support.ToutiaoRestException;
import com.google.common.collect.ImmutableList;
import org.junit.Test;

public class AdvertiserApiTest {
    String token = "77031749b1560cbeae3067c65d6ad824e5a1175a";

    @Test
    public void getInfo() throws ToutiaoRestException {
        String token = "6a305dcab0a79760d053d94e4a6fc070fdf03382";
        // ["id", "name", "email", "status"]
        AdvertiserInfoResponse info = AdvertiserApi.getInfo(token, ImmutableList.of(103779788747L),
                ImmutableList.of("id", "name", "email", "status"));
        System.out.println(info.toJSON());
    }

    @Test
    public void updateBudget() {
        UpdateBudgetRequest request = new UpdateBudgetRequest();
        request.setAdvertiser_id(99018847074L);
        request.setBudget(10000F);
        request.setBudget_mode("BUDGET_MODE_DAY");
        AdvertiserApi.updateBudget(token, request);
    }
}
