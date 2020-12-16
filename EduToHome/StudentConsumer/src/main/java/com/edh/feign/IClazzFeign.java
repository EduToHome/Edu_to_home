package com.edh.feign;

import com.edh.entity.Clazz;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("student-provider")
public interface IClazzFeign {

    @GetMapping("/clazz/selectOne")
    Clazz selectOne(@RequestParam("cid") Integer cid);

    @PostMapping("/clazz/insert")
    Clazz insert(Clazz clazz);

    @PostMapping("/clazz/update")
    Clazz update(Clazz clazz);

    @GetMapping("/clazz/delete")
    boolean delete(@RequestParam("cid") Integer cid);
}
