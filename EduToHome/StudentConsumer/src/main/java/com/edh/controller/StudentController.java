package com.edh.controller;

import com.edh.entity.Student;
import com.edh.feign.IStudentFeign;
import com.edh.util.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@RestController
@Api(tags = "学生表相关接口")
public class StudentController {

    @Autowired
    private IStudentFeign feign;
    @Resource
    private RedisUtil redisUtil;

    @GetMapping("/queryAllStudents")
    @ApiOperation(value = "查询所有学生")
    List<Object> queryAll(@RequestParam(value = "key", defaultValue = "students") String key) {

        List<Object> list = redisUtil.lGet(key, 0, -1);
        System.out.println(key + "\t" + list);

        if(list != null && list.size() != 0){
            return list;
        }else {

            List<Object> students = Collections.singletonList(feign.queryAll());
            System.out.println("students: " + students);

            redisUtil.lSet(key, students,60);
            return students;
        }
    }

    @GetMapping("/selectOneStudent")
    @ApiOperation(value = "根据主键查单个学生")
    public Object selectOneStudent(Integer sid,@RequestParam(value = "key", defaultValue = "student") String key) {
        List<Object> list = redisUtil.lGet(key, 0, -1);
        if (list != null && list.size() != 0){
            return list;
        }else{
            Student student = feign.selectOne(sid);
            redisUtil.lSet(key,student,60);
            return student;
        }
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
    List<Object> getByCid(Integer cid,@RequestParam(value = "key", defaultValue = "students") String key) {
        List<Object> list = redisUtil.lGet(key, 0, -1);
        if (list != null && list.size() != 0){
            return list;
        }else{
            List<Object> studentsByCid = Collections.singletonList(feign.getByCid(cid));
            redisUtil.lSet(key,studentsByCid,60);
            return studentsByCid;
        }
    }
}
