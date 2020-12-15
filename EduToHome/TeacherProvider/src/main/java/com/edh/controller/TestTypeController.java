package com.edh.controller;

import com.edh.entity.TestType;
import com.edh.service.TestTypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TestType)表控制层
 *
 * @author makejava
 * @since 2020-12-15 11:29:41
 */
@RestController
@RequestMapping("testType")
public class TestTypeController {
    /**
     * 服务对象
     */
    @Resource
    private TestTypeService testTypeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TestType selectOne(Integer id) {
        return this.testTypeService.queryById(id);
    }

    @PostMapping("insertTestType")
    public TestType insert(@RequestBody TestType testType){
        return testTypeService.insert(testType);
    }

    @PostMapping("getAll")
    public List<TestType> getAllByX(@RequestBody TestType testType){
        return testTypeService.queryAll(testType);
    }

}