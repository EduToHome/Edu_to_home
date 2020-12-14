package com.edh.controller;

import com.edh.entity.Content;
import com.edh.feign.IContentFeign;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "试卷内容表相关接口")
public class ContentFeignController {

    @Autowired
    private IContentFeign contentFeign;

    @ApiOperation(value = "根据coid查询单个试卷内容")
    @GetMapping("selectOneContent")
    public Content selectOne(Integer coid){
        return contentFeign.selectOne(coid);
    }

    @ApiOperation(value = "新增试卷内容")
    @PostMapping("insertContent")
    public Content insertContent(Content content){
        return contentFeign.insertContent(content);
    }

    @ApiOperation(value = "根据coid修改单个试卷内容")
    @PostMapping("updateContent")
    public Content updateContent(Content content){
        return contentFeign.updateContent(content);
    }

    @ApiOperation(value = "根据coid删除单个试卷内容")
    @GetMapping("deleteContentByCoid")
    public boolean deleteContentByCoid(Integer coid){
       return contentFeign.deleteContentByCoid(coid);
    }

    @ApiOperation(value = "根据某些字段查询试卷内容")
    @PostMapping("getAllContent")
    public List<Content> getAllContent(Content content){
        return contentFeign.getAllContent(content);
    }


}
