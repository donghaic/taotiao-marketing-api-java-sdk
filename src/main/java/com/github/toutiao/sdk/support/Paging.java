package com.github.toutiao.sdk.support;

import com.github.toutiao.sdk.api.bean.BaseModel;
import lombok.Data;

@Data
public class Paging extends BaseModel {
    Integer page;
    Integer page_size;
    Integer total_number;
    Integer total_page;
}
