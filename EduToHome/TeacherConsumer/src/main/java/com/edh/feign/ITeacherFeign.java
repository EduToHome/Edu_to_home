package com.edh.feign;

import com.edh.entity.Teacher;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("teacher-provider")
public interface ITeacherFeign {

    //根据tid查询单个教师
    @GetMapping("teacher/selectOneTeacher")
    Teacher selectOneTeacher(@RequestParam("tid") Integer tid);

    //查询所有的教师
    @GetMapping("teacher/getAllTeacher")
    List<Teacher> getAllTeacher();

    //新增教师
    @PostMapping("teacher/insertTeacher")
    Teacher insertTeacher(Teacher teacher);

    //根据tid删除教师
    @ApiOperation(value = "根据tid删除单个教师信息")
    @GetMapping("teacher/deleteTeacherByTid")
    boolean deleteTeacherByTid(@RequestParam("tid")Integer tid);

    //修改教师信息
    @PostMapping("teacher/updateTeacher")
    Teacher updateTeacher(Teacher teacher);

    //根据uid删除教师
    @GetMapping("teacher/deleteTeacherByUid")
    boolean deleteTeacherByUid(@RequestParam("uid")Integer uid);




}
