package com.edh.controller;

import com.edh.entity.Clazz;
import com.edh.feign.IClazzFeign;
import com.edh.util.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = "班级表相关接口")
public class ClazzController {

    @Autowired
    private IClazzFeign feign;
    @Resource
    private RedisUtil redisUtil;

    @GetMapping("/selectOneClazz")
    @ApiOperation(value = "查询所有班级")
    public Object selectOne(Integer cid,@RequestParam(value = "key", defaultValue = "clazz") String key) {
        List<Object> list = redisUtil.lGet(key+cid, 0, -1);

        if (list != null && list.size() != 0){
            return list;
        }else{
            Clazz clazz = feign.selectOne(cid);
            redisUtil.lSet(key+cid,clazz,60);
            return clazz;
        }
    }

    @PostMapping("/insertClazz")
    @ApiOperation(value = "新增班级")
    public Clazz insert(Clazz clazz) {
        return feign.insert(clazz);
    }

    @PostMapping("/updateClazz")
    @ApiOperation(value = "修改班级")
    public Clazz update(Clazz clazz) {
        return feign.update(clazz);
    }

    @PostMapping("/deleteClazz")
    @ApiOperation(value = "删除班级")
    public boolean delete(Integer cid) {
        return feign.delete(cid);
    }
}
