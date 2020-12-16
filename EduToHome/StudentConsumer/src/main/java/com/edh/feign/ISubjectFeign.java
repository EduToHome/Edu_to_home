package com.edh.feign;

import com.edh.entity.Subject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("student-provider")
public interface ISubjectFeign {

    @GetMapping("/subject/selectOne")
    Subject selectOne(@RequestParam("suid") Integer suid);

    @PostMapping("/subject/insert")
    Subject insert(Subject subject);

    @PostMapping("/subject/update")
    Subject update(Subject subject);

    @GetMapping("/subject/delete")
    boolean delete(@RequestParam("suid") Integer suid);

}
