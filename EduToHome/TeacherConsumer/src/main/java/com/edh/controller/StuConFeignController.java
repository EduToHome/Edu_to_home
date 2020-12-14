package com.edh.controller;

import com.edh.entity.StudentContent;
import com.edh.feign.IStuContentFeign;
import com.edh.util.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "学生试卷内容相关接口")
public class StuConFeignController {

    @Autowired
    private IStuContentFeign stuContentFeign;

    @Autowired
    private RedisUtil redisUtil;

    @ApiOperation(value = "根据scid查询单个学生试卷内容")
    @GetMapping("selectOneStuContent")
    public StudentContent selectOne(Integer scid){
        String cid = "stuCon"+scid.toString();

        if (redisUtil.get(cid)!=null){
            return (StudentContent) redisUtil.get(cid);
        }else {
            StudentContent studentContent = stuContentFeign.selectOne(scid);
            redisUtil.set(cid,studentContent,20);
            return studentContent;
        }
    }

    @ApiOperation(value = "新增学生试卷内容")
    @PostMapping("insertStuCon")
    public StudentContent insertStuCon(StudentContent studentContent){
        return stuContentFeign.insertSContent(studentContent);
    }

    @ApiOperation(value = "根据scid修改单个学生试卷内容")
    @PostMapping("updateStuCon")
    public StudentContent updateStuCon(StudentContent studentContent){
        return stuContentFeign.updateSContent(studentContent);
    }

    @ApiOperation(value = "根据scid删除单个学生试卷内容")
    @GetMapping("deleteStuConByscid")
    public boolean deleteStuConByscid(Integer scid){
        return stuContentFeign.deleteSContentByScid(scid);
    }

    @ApiOperation(value = "根据某些条件查询学生试卷内容")
    @PostMapping("getAllStuConByX")
    public List<StudentContent> getAllStuConByX(StudentContent studentContent){
        return stuContentFeign.getAllSContent(studentContent);
    }

}
