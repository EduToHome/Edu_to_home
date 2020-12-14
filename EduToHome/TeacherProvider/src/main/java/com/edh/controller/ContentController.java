package com.edh.controller;

import com.edh.entity.Content;
import com.edh.service.ContentService;
import io.swagger.models.auth.In;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Content)表控制层
 *
 * @author makejava
 * @since 2020-12-12 14:26:06
 */
@RestController
@RequestMapping("content")
public class ContentController {
    /**
     * 服务对象
     */
    @Resource
    private ContentService contentService;

    /**
     * 通过主键查询单条数据
     *
     * @param coid 主键
     * @return 单条数据
     */
    @GetMapping("selectOneContent")
    public Content selectOne(@RequestParam("coid")Integer coid) {
        return this.contentService.queryById(coid);
    }

    @PostMapping("insertContent")
    public Content insertContent(@RequestBody Content content){
        return contentService.insert(content);
    }

    @PostMapping("updateContent")
    public Content updateContent(@RequestBody Content content){
        return contentService.update(content);
    }

    @GetMapping("deleteContentByCoid")
    public boolean deleteContentByCoid(@RequestParam("coid")Integer coid){
        return contentService.deleteById(coid);
    }

    @PostMapping("getAllContent")
    public List<Content> getAllContent(@RequestBody Content content){
        return contentService.queryAll(content);
    }



}