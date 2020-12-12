package com.edh.feign;

import com.edh.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("student-provider")
public interface IStudentFeign {

    @GetMapping("/student/selectOne")
    Student selectOne(@RequestParam("sid") Integer sid);

    @GetMapping("/student/queryAll")
    List<Student> queryAll();

    @PostMapping("/student/insert")
    Student insert(Student student);

    @PostMapping("/student/update")
    Student update(Student student);

    @GetMapping("/student/deleteById")
    boolean deleteBySid(@RequestParam("sid") Integer sid);

    @GetMapping("/student/getByCid")
    List<Student> getByCid(@RequestParam("cid") Integer cid);

}
