package com.edh.feign;

import com.edh.entity.ClassSub;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("student-provider")
public interface IClassSubFeign {

    @GetMapping("/classSub/selectOne")
    ClassSub selectOne(@RequestParam("csid") Integer csid);

    @PostMapping("/classSub/insert")
    ClassSub insert(ClassSub classSub);

    @PostMapping("/classSub/update")
    ClassSub update(ClassSub classSub);

    @GetMapping("/classSub/delete")
    boolean delete(@RequestParam("csid") Integer csid);

    @GetMapping("/classSub/getClassSubByCid")
    List<ClassSub> getClassSubByCid(@RequestParam("cid") Integer cid);

}
