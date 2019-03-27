package com.test.swagger.bean;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by jiaxiong on 2019-03-24 09:51
 */
@ApiModel(value = "测试返回数据")
public class TestResult {

    @ApiModelProperty(value = "返回参数1")
    private String param1;
    @ApiModelProperty(value = "返回参数2")
    private String param2;
    @ApiModelProperty(value = "返回参数3")
    private String param3;
    @ApiModelProperty(value = "返回参数4")
    private String param4;

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

    public String getParam3() {
        return param3;
    }

    public void setParam3(String param3) {
        this.param3 = param3;
    }

    public String getParam4() {
        return param4;
    }

    public void setParam4(String param4) {
        this.param4 = param4;
    }

}
