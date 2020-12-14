package com.edh.controller;

import com.edh.entity.ClassSub;
import com.edh.service.ClassSubService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ClassSub)表控制层
 *
 * @author makejava
 * @since 2020-12-14 16:29:34
 */
@RestController
@RequestMapping("classSub")
public class ClassSubController {
    /**
     * 服务对象
     */
    @Resource
    private ClassSubService classSubService;

    /**
     * 通过主键查询单条数据
     *
     * @param csid 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ClassSub selectOne(Integer csid) {
        return this.classSubService.queryById(csid);
    }

    @PostMapping("/insert")
    public ClassSub insert(@RequestBody ClassSub classSub){
        return classSubService.insert(classSub);
    }

    @PostMapping("/update")
    public ClassSub update(@RequestBody ClassSub classSub){
        return classSubService.update(classSub);
    }

    @GetMapping("/delete")
    public boolean delete(Integer csid){
        return classSubService.deleteById(csid);
    }

    @GetMapping("/getClassSubByCid")
    public List<ClassSub> getClassSubByCid(Integer cid){
        return classSubService.getClassSubByCid(cid);
    }
}