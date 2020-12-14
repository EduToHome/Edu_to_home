package com.edh.controller;

import com.edh.entity.StudentContent;
import com.edh.service.StudentContentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (StudentContent)表控制层
 *
 * @author makejava
 * @since 2020-12-14 15:31:50
 */
@RestController
@RequestMapping("studentContent")
public class StudentContentController {
    /**
     * 服务对象
     */
    @Resource
    private StudentContentService studentContentService;

    /**
     * 通过主键查询单条数据
     *
     * @param scid 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public StudentContent selectOne(@RequestParam("scid") Integer scid) {
        return this.studentContentService.queryById(scid);
    }

    @PostMapping("insertSContent")
    public StudentContent insertSContent(@RequestBody StudentContent studentContent){
        return studentContentService.insert(studentContent);
    }

    @PostMapping("updateSContent")
    public StudentContent updateSContent(@RequestBody StudentContent studentContent){
        return studentContentService.update(studentContent);
    }

    @GetMapping("deleteSContentByScid")
    public boolean deleteSContentByScid(@RequestParam("scid") Integer scid){
        return studentContentService.deleteById(scid);
    }

    @PostMapping("getAllSContent")
    public List<StudentContent> getAllSContent(@RequestBody StudentContent studentContent){
        return studentContentService.queryAll(studentContent);
    }



}