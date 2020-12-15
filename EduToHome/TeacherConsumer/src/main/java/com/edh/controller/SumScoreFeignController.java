package com.edh.controller;

import com.edh.entity.SumScore;
import com.edh.feign.ISumScoreFeign;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "成绩表相关接口")
public class SumScoreFeignController {

    @Autowired
    private ISumScoreFeign sumScoreFeign;

    @ApiOperation(value = "根据id查询成绩")
    @GetMapping("selectOneSumScore")
    public SumScore selectOne(Integer id){
        return sumScoreFeign.selectOne(id);
    }

    @ApiOperation(value = "新增成绩表内容")
    @PostMapping("insertSumScore")
    public SumScore insert(SumScore sumScore){
        return sumScoreFeign.insert(sumScore);
    }

    @ApiOperation(value = "根据sumSid修改成绩内容")
    @PostMapping("updateSumScore")
    public SumScore update(SumScore sumScore){
      return sumScoreFeign.update(sumScore);
    }

    @ApiOperation(value = "根据sumSid删除单个成绩")
    @GetMapping("deleteSumScoreBysumSid")
    public boolean delete(Integer sumSid){
        return sumScoreFeign.delete(sumSid);
    }

    @ApiOperation(value = "根据某些字段查询成绩")
    @PostMapping("getAllByXX")
    public List<SumScore> getAllByX(SumScore sumScore){
        return sumScoreFeign.getAllByX(sumScore);
    }



}
