package com.edh.controller;

import com.edh.entity.Subject;
import com.edh.service.SubjectService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Subject)表控制层
 *
 * @author makejava
 * @since 2020-12-14 16:28:46
 */
@RestController
@RequestMapping("subject")
public class SubjectController {
    /**
     * 服务对象
     */
    @Resource
    private SubjectService subjectService;

    /**
     * 通过主键查询单条数据
     *
     * @param suid 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Subject selectOne(Integer suid) {
        return this.subjectService.queryById(suid);
    }

    @PostMapping("/insert")
    public Subject insert(@RequestBody Subject subject){
        return subjectService.insert(subject);
    }

    @PostMapping("/update")
    public Subject update(@RequestBody Subject subject){
        return subjectService.update(subject);
    }

    @GetMapping("/delete")
    public boolean delete(Integer suid){
        return subjectService.deleteById(suid);
    }
}