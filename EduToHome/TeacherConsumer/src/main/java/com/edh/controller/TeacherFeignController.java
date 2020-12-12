package com.edh.controller;

import com.edh.entity.Teacher;
import com.edh.feign.ITeacherFeign;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "教师表相关接口")
public class TeacherFeignController {

    @Autowired
    private ITeacherFeign teacherFeign;
    @ApiOperation(value = "根据tid查询单个教师信息")
    @GetMapping("selectOneTeacher")
    public Teacher selectOneTeacher(Integer tid){
       return  teacherFeign.selectOneTeacher(tid);
    }

    @ApiOperation(value = "查询所有教师信息")
    @GetMapping("getAllTeacher")
    public List<Teacher> getAllTeacher(){
        return teacherFeign.getAllTeacher();
    }

    @ApiOperation(value = "新增教师信息")
    @PostMapping("insertTeacher")
    public  Teacher insertTeacher(Teacher teacher){
        return teacherFeign.insertTeacher(teacher);
    }

    @ApiOperation(value = "根据tid删除单个教师信息")
    @GetMapping("deleteTeacherByTid")
    boolean deleteTeacherByTid(Integer tid){
        return teacherFeign.deleteTeacherByTid(tid);
    }

    @ApiOperation(value = "根据tid修改单个教师信息")
    @PostMapping("updateTeacher")
    Teacher updateTeacher(Teacher teacher){
        return teacherFeign.updateTeacher(teacher);
    }

    @ApiOperation(value = "根据uid删除单个教师信息")
    @GetMapping("deleteTeacherByUid")
    boolean deleteTeacherByUid(@RequestParam("uid")Integer uid){
        return teacherFeign.deleteTeacherByUid(uid);
    }
}
