package com.edh.controller;

import com.edh.entity.Student;
import com.edh.feign.IStudentFeign;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "学生表相关接口")
public class StudentController {

    @Autowired
    private IStudentFeign feign;

    @GetMapping("/selectOneStudent")
    @ApiOperation(value = "根据主键查单个学生")
    public Student selectOneStudent(Integer sid) {
        return feign.selectOne(sid);
    }

    @GetMapping("/queryAllStudents")
    @ApiOperation(value = "查询所有学生")
    List<Student> queryAll() {
        return feign.queryAll();
    }

    @PostMapping("/student/insertStudent")
    @ApiOperation(value = "新增学生")
    Student insert(Student student) {
        return feign.insert(student);
    }

    @PostMapping("/student/updateStudent")
    @ApiOperation(value = "修改学生")
    Student update(Student student){
        return feign.update(student);
    }

    @GetMapping("/student/deleteStudentBySid")
    @ApiOperation(value = "删除学生")
    boolean deleteBySid(Integer sid) {
        return feign.deleteBySid(sid);
    }

    @GetMapping("/student/getStudentByCid")
    @ApiOperation(value = "根据班级ID查学生集合")
    List<Student> getByCid(Integer cid) {
        return feign.getByCid(cid);
    }
}
