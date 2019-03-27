package com.test.swagger.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by jiaxiong on 2019-03-27 14:52
 */
@ApiModel(value = "测试请求数据")
public class TestRequest {

    @ApiModelProperty(value = "请求参数1")
    private String param1;

    @ApiModelProperty(value = "请求参数2")
    private String param2;

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }

}
