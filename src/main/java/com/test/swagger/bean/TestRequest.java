package com.test.swagger.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author jiaxiong
 * @date 2019/3/24 09:51 上午
 */
@ApiModel(value = "测试请求数据")
@Data
public class TestRequest {

    @ApiModelProperty(value = "请求参数1")
    private String param1;

    @ApiModelProperty(value = "请求参数2")
    private String param2;

}
