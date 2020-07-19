package com.test.swagger.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author jiaxiong
 * @date 2019/3/24 09:51 上午
 */
@ApiModel(value = "测试返回数据")
@Data
public class TestResult {

    @ApiModelProperty(value = "返回参数1")
    private String param1;
    @ApiModelProperty(value = "返回参数2")
    private String param2;
    @ApiModelProperty(value = "返回参数3")
    private String param3;
    @ApiModelProperty(value = "返回参数4")
    private String param4;

}
