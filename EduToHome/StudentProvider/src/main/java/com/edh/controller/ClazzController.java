package com.edh.controller;

import com.edh.entity.Clazz;
import com.edh.service.ClazzService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Clazz)表控制层
 *
 * @author makejava
 * @since 2020-12-14 15:13:46
 */
@RestController
@RequestMapping("/clazz")
public class ClazzController {
    /**
     * 服务对象
     */
    @Resource
    private ClazzService clazzService;

    /**
     * 通过主键查询单条数据
     *
     * @param cid 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Clazz selectOne(Integer cid) {
        return this.clazzService.queryById(cid);
    }

    @PostMapping("/insert")
    public Clazz insert(@RequestBody Clazz clazz){
        return clazzService.insert(clazz);
    }

    @PostMapping("/update")
    public Clazz update(@RequestBody Clazz clazz){
        return clazzService.update(clazz);
    }

    @GetMapping("/delete")
    public boolean delete(Integer cid){
        return clazzService.deleteById(cid);
    }
}