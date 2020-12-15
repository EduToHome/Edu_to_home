package com.edh.feign;

import com.edh.entity.TestType;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient("teacher-provider")
public interface ITestTypeFeign {

    @PostMapping("testType/insertTestType")
    TestType insert(TestType testType);

    @PostMapping("testType/getAll")
    List<TestType> getAllByX(TestType testType);
}
