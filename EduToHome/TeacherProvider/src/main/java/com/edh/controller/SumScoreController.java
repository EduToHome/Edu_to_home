package com.edh.controller;

import com.edh.entity.SumScore;
import com.edh.service.SumScoreService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * (SumScore)表控制层
 *
 * @author makejava
 * @since 2020-12-15 10:04:00
 */
@RestController
@RequestMapping("sumScore")
public class SumScoreController {

    /**
     * 服务对象
     */
    @Resource
    private SumScoreService sumScoreService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SumScore selectOne(@RequestParam("id") Integer id) {
        return this.sumScoreService.queryById(id);
    }

    @PostMapping("insertSumScore")
    public SumScore insert(@RequestBody SumScore sumScore){
        return sumScoreService.insert(sumScore);
    }

    @PostMapping("updateSumScore")
    public SumScore update(@RequestBody SumScore sumScore){
        return sumScoreService.update(sumScore);
    }

    @GetMapping("deleteSumScoreBysumSid")
    public boolean delete(@RequestParam("sumSid") Integer sumSid){
        return sumScoreService.deleteById(sumSid);
    }

    @PostMapping("getAllByX")
    public List<SumScore> getAllByX(@RequestBody SumScore sumScore){
        return sumScoreService.queryAll(sumScore);
    }

}