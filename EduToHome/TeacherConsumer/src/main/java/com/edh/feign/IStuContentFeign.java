package com.edh.feign;

import com.edh.entity.StudentContent;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("teacher-provider")
public interface IStuContentFeign {

    @GetMapping("studentContent/selectOne")
    StudentContent selectOne(@RequestParam("scid") Integer scid);

    @PostMapping("studentContent/insertSContent")
    StudentContent insertSContent(StudentContent studentContent);

    @PostMapping("studentContent/updateSContent")
    StudentContent updateSContent(StudentContent studentContent);

    @GetMapping("studentContent/deleteSContentByScid")
    boolean deleteSContentByScid(@RequestParam("scid")Integer scid);

    @PostMapping("studentContent/getAllSContent")
    List<StudentContent> getAllSContent(StudentContent studentContent);
}
