package com.test.swagger.controller;


import com.test.swagger.bean.TestRequest;
import com.test.swagger.bean.TestResult;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

/**
 * @author jiaxiong
 * @date 2019/3/24 09:51 上午
 */
@RestController
@RequestMapping("/api/test")
@Api(value = "TestController", tags = "Test控制器")
public class TestController {

    @ApiOperation(value = "测试POST请求", notes = "测试方法")
    @PostMapping(value = "/postAsBody")
    public TestResult testPostAsBody(@RequestBody TestRequest testRequest) {
        TestResult result = new TestResult();
        result.setParam1(testRequest.getParam1());
        result.setParam2(testRequest.getParam2());
        return result;
    }

    @ApiOperation(value = "测试POST请求(form)", notes = "测试方法")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "param1", value = "第一个参数", required = true, paramType = "form"),
            @ApiImplicitParam(name = "param2", value = "第二个参数", required = true, paramType = "form"),
    })
    @PostMapping(value = "/postAsForm")
    public TestResult testPostAsForm(String param1, String param2) {
        TestResult result = new TestResult();
        result.setParam1(param1);
        result.setParam2(param2);
        return result;
    }

    @ApiOperation(value = "测试GET请求", notes = "测试方法")
    @GetMapping(value = "/get")
    public String testGet() {
        return "**测试**";
    }

}
