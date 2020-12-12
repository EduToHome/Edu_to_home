package com.edh.controller;

import com.edh.entity.Teacher;
import com.edh.service.TeacherService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Teacher)表控制层
 *
 * @author makejava
 * @since 2020-12-11 22:57:10
 */
@RestController
@RequestMapping("teacher")
public class TeacherController {
    /**
     * 服务对象
     */
    @Resource
    private TeacherService teacherService;

    /**
     * 通过主键查询单条数据
     *
     * @param tid 主键
     * @return 单条数据
     */
    @GetMapping("selectOneTeacher")
    public Teacher selectOne(@RequestParam("tid")Integer tid) {
        return this.teacherService.queryById(tid);
    }

    /**
     * 查询所有老师
     * @return 教师列表
     */
    @GetMapping("getAllTeacher")
    public List<Teacher> getAllTeacher(){
        return teacherService.queryAll();
    }

    /**
     * 新增教师信息
     * @param teacher
     * @return 新增的教师对象信息
     */
    @PostMapping("insertTeacher")
    public Teacher insertTeacher(@RequestBody Teacher teacher ){
       return teacherService.insert(teacher);
    }

    /**
     * 根据tid删除教师信息
     * @param tid
     * @return true删除成功   false删除失败
     */
    @GetMapping("deleteTeacherByTid")
    public boolean deleteTeacherByTid(@RequestParam("tid")Integer tid){
        return teacherService.deleteById(tid);
    }

    /**
     * 根据tid修改教师信息
     * @param teacher
     * @return 修改后的教师信息
     */
    @PostMapping("updateTeacher")
    public Teacher updateTeacher(@RequestBody Teacher teacher){
        return teacherService.update(teacher);
    }


    /**
     * 根据tid删除教师信息
     * @param uid
     * @return true删除成功   false删除失败
     */
    @GetMapping("deleteTeacherByUid")
    public boolean deleteTeacherByUid(@RequestParam("uid")Integer uid) {
        return teacherService.deleteByUid(uid);
    }
}