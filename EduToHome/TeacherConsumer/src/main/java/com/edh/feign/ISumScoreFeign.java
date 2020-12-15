package com.edh.feign;

import com.edh.entity.SumScore;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("teacher-provider")
public interface ISumScoreFeign {

    @GetMapping("sumScore/selectOne")
    SumScore selectOne(@RequestParam("id") Integer id);

    @PostMapping("sumScore/insertSumScore")
    SumScore insert(SumScore sumScore);

    @PostMapping("sumScore/updateSumScore")
    SumScore update(SumScore sumScore);

    @PostMapping("sumScore/getAllByX")
    List<SumScore> getAllByX(SumScore sumScore);

    @GetMapping("sumScore/deleteSumScoreBysumSid")
    boolean delete(@RequestParam("sumSid")Integer sumSid);

}
