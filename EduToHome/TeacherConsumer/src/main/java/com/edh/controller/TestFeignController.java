package com.edh.controller;

import com.edh.entity.Test;
import com.edh.feign.ITestFeign;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "试卷表相关接口")
public class TestFeignController {

    @Autowired
    private ITestFeign testFeign;

    @ApiOperation(value = "根据teid查询单份试卷信息")
    @GetMapping("selectOneTest")
    public Test selectOneTest(Integer teid){
        return testFeign.queryById(teid);
    }

    @ApiOperation(value = "新增试卷信息")
    @PostMapping("insertTest")
    public Test insertTest(Test test){
        return testFeign.insertTest(test);
    }

    @ApiOperation(value = "根据teid修改试卷信息")
    @PostMapping("updateTest")
    public Test updateTest(Test test){
        return testFeign.updateTest(test);
    }

    @ApiOperation(value = "根据teid删除试卷信息")
    @GetMapping("deleteTestByTeid")
    public boolean deleteTestByTeid(Integer teid){
        return testFeign.deleteByTeid(teid);
    }

    @ApiOperation(value = "根据试卷表中的某一个或某些字段查询试卷信息")
    @PostMapping("queryAll")
    public List<Test> queryAll(Test test){
        return testFeign.getTest(test);
    }

}
