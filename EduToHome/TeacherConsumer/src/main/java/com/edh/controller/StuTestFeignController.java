package com.edh.controller;

import com.edh.entity.StudentTest;
import com.edh.feign.IStuTestFeign;
import com.edh.util.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "学生试卷表相关接口")
public class StuTestFeignController {

    @Autowired
    private IStuTestFeign stuTestFeign;

    @ApiOperation(value = "根据id查询单个学生试卷")
    @GetMapping("selectOne")
    public StudentTest selectOne(Integer id){
      return   stuTestFeign.selectOne(id);
    }

    @ApiOperation(value = "新增学生试卷")
    @PostMapping("insertStuTest")
    public StudentTest insert(StudentTest studentTest){
        return stuTestFeign.insert(studentTest);
    }

    @ApiOperation(value = "根据stid修改单个学生试卷")
    @PostMapping("updateStuTest")
    public StudentTest update(StudentTest studentTest){
        return stuTestFeign.update(studentTest);
    }

    @ApiOperation(value = "根据scid删除单个学生试卷")
    @GetMapping("deleteStuTestByStid")
    public boolean deleteStuTestByStid(Integer stid){
        return stuTestFeign.deleteStuTestByStid(stid);
    }

    @ApiOperation(value = "根据某些字段查询学生试卷集合")
    @PostMapping("getAllByX")
    public List<StudentTest> getAllByX(StudentTest studentTest){

        return stuTestFeign.getAllByX(studentTest);
    }

}
