package com.edh.controller;

import com.edh.entity.StudentTest;
import com.edh.service.StudentTestService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (StudentTest)表控制层
 *
 * @author makejava
 * @since 2020-12-14 15:16:05
 */
@RestController
@RequestMapping("studentTest")
public class StudentTestController {
    /**
     * 服务对象
     */
    @Resource
    private StudentTestService studentTestService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOneStuTest")
    public StudentTest selectOne(@RequestParam("id") Integer id) {
        return this.studentTestService.queryById(id);
    }

    @PostMapping("insertStuTest")
    public StudentTest insert(@RequestBody StudentTest studentTest){
        return studentTestService.insert(studentTest);
    }

    @PostMapping("updateStuTest")
    public StudentTest update(@RequestBody StudentTest studentTest){
        return studentTestService.update(studentTest);
    }

    @GetMapping("deleteStuTestByStid")
    public boolean deleteStuTestByStid(@RequestParam("stid") Integer stid){
        return studentTestService.deleteById(stid);
    }

    @PostMapping("getAllByX")
    public List<StudentTest> getAllByX(@RequestBody StudentTest studentTest){
        return studentTestService.queryAll(studentTest);
    }

}