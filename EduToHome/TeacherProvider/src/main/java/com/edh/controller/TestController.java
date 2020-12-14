package com.edh.controller;

import com.edh.entity.Test;
import com.edh.service.TestService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Test)表控制层
 *
 * @author makejava
 * @since 2020-12-12 10:14:35
 */
@RestController
@RequestMapping("test")
public class TestController {
    /**
     * 服务对象
     */
    @Resource
    private TestService testService;

    /**
     * 通过主键查询单条数据
     *
     * @param teid 主键
     * @return 单条数据
     */
    @GetMapping("selectOneTest")
    public Test selectOne( @RequestParam("teid")Integer teid) {
        return this.testService.queryById(teid);
    }

    /**
     * 新增试卷信息
     * @param test
     * @return 试卷实例
     */
    @PostMapping("insertTest")
    public Test insertTest(@RequestBody Test test){
        return testService.insert(test);
    }

    /**
     * 根据teid修改试卷信息
     * @param test
     * @return  试卷实例
     */
    @PostMapping("updateTest")
    public Test updateTest(@RequestBody Test test){
        return testService.update(test);
    }

    /**
     * 根据teid删除试卷
     * @param teid
     * @return true成功  false 失败
     */
    @GetMapping("deleteByTeid")
    public boolean deleteByTeid( @RequestParam("teid")Integer teid){
        return testService.deleteById(teid);
    }

    /**
     *适应所有查询
     * @param test
     * @return
     */
    @PostMapping("queryAll")
    public List<Test> getTest(@RequestBody Test test){
        return testService.queryAll(test);
    }





}