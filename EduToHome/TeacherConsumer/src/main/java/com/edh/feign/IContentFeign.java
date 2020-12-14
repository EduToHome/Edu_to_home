package com.edh.feign;

import com.edh.entity.Content;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("teacher-provider")
public interface IContentFeign {

    @GetMapping("content/selectOneContent")
    Content selectOne(@RequestParam("coid")Integer coid);

    @PostMapping("content/insertContent")
    Content insertContent(Content content);

    @PostMapping("content/updateContent")
    Content updateContent(Content content);

    @GetMapping("content/deleteContentByCoid")
    boolean deleteContentByCoid(@RequestParam("coid") Integer coid);

    @PostMapping("content/getAllContent")
    List<Content> getAllContent(Content content);

}
