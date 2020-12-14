package com.edh.controller;

import com.edh.entity.Student;
import com.edh.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Student)表控制层
 *
 * @author makejava
 * @since 2020-12-12 11:17:36
 */
@RestController
@RequestMapping("student")
public class StudentController {
    /**
     * 服务对象
     */
    @Resource
    private StudentService studentService;

    /**
     * 通过主键查询单条数据
     *
     * @param sid 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Student selectOne(Integer sid) {
        return this.studentService.queryById(sid);
    }

    @GetMapping("queryAll")
    public List<Student> queryAll(Student student){
        return studentService.queryAll(student);
    }

    @PostMapping("insert")
    public Student insert(@RequestBody Student student){
        return studentService.insert(student);
    }

    @PostMapping("/update")
    public Student update(@RequestBody Student student){
        return studentService.update(student);
    }

    @GetMapping("/deleteById")
    public boolean deleteById(Integer sid){
        return studentService.deleteById(sid);
    }

    @GetMapping("/getByCid")
    public List<Student> getByCid(Integer cid){
        return studentService.getByCid(cid);
    }

}