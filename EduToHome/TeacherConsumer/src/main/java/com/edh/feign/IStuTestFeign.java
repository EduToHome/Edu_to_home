package com.edh.feign;

import com.edh.entity.StudentTest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("teacher-provider")
public interface IStuTestFeign {

    @GetMapping("studentTest/selectOneStuTest")
    StudentTest selectOne(@RequestParam("id") Integer id);

    @PostMapping("studentTest/insertStuTest")
    StudentTest insert(StudentTest studentTest);

    @PostMapping("studentTest/updateStuTest")
    StudentTest update(StudentTest studentTest);

    @GetMapping("studentTest/deleteStuTestByStid")
    boolean deleteStuTestByStid(@RequestParam("stid") Integer stid);

    @PostMapping("studentTest/getAllByX")
    List<StudentTest> getAllByX(StudentTest studentTest);


}
