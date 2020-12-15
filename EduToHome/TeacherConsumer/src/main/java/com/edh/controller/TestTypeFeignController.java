package com.edh.controller;

import com.edh.entity.TestType;
import com.edh.feign.ITestTypeFeign;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "试卷类型相关接口")
public class TestTypeFeignController {

    @Autowired
    private ITestTypeFeign testTypeFeign;

    @ApiOperation(value = "新增试卷类型")
    @PostMapping("insertTestType")
    public TestType insert(TestType testType){
        return testTypeFeign.insert(testType);
    }

    @ApiOperation(value = "根据某些元素查询")
    @PostMapping("getAll")
    public List<TestType> getAllByX(TestType testType){
        return testTypeFeign.getAllByX(testType);
    }

}
