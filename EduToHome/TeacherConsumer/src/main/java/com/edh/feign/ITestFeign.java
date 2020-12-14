package com.edh.feign;

import com.edh.entity.Test;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("teacher-provider")
public interface ITestFeign {

    @GetMapping("test/selectOneTest")
    Test queryById( @RequestParam("teid")Integer teid);

    @PostMapping("test/insertTest")
    Test insertTest(Test test);

    @PostMapping("test/updateTest")
    Test updateTest(Test test);

    @GetMapping("test/deleteByTeid")
    boolean deleteByTeid( @RequestParam("teid")Integer teid);

    @PostMapping("test/queryAll")
    List<Test> getTest(Test test);



}
