package com.edh.controller;

import com.edh.entity.Clazz;
import com.edh.entity.Subject;
import com.edh.feign.ISubjectFeign;
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
@Api(tags = "科目表相关接口")
public class SubjectController {

    @Autowired
    private ISubjectFeign feign;
    @Resource
    private RedisUtil redisUtil;

    @GetMapping("/selectOneSubject")
    @ApiOperation(value = "查询所有科目")
    public Object selectOne(Integer suid,@RequestParam(value = "key",defaultValue = "subject")String key){
        List<Object> list = redisUtil.lGet(key+suid, 0, -1);
        if (list != null && list.size() != 0){
            return list;
        }else{
            Subject subject = feign.selectOne(suid);
            redisUtil.lSet(key+suid,subject,60);
            return subject;
        }
    }

    @PostMapping("/insertSubject")
    @ApiOperation(value = "新增科目")
    public Subject insert(Subject subject) {
        return feign.insert(subject);
    }

    @PostMapping("/updateSubject")
    @ApiOperation(value = "修改科目")
    public Subject update(Subject subject) {
        return feign.update(subject);
    }

    @GetMapping("/deleteSubject")
    @ApiOperation(value = "删除科目")
    public boolean delete(Integer suid) {
        return feign.delete(suid);
    }
}
