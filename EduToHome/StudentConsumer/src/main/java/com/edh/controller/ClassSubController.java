package com.edh.controller;

import com.edh.entity.ClassSub;
import com.edh.feign.IClassSubFeign;
import com.edh.util.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@RestController
@Api(tags = "班级科目表相关接口")
public class ClassSubController {

    @Autowired
    private IClassSubFeign feign;
    @Resource
    private RedisUtil redisUtil;

    @GetMapping("/selectOneClassSub")
    public Object selectOne(Integer csid,@RequestParam(value = "key",defaultValue = "classSub")String key) {
        List<Object> list = redisUtil.lGet(key+csid, 0, -1);

        if (list != null && list.size() != 0){
            return list;
        }else{
            ClassSub classSub = feign.selectOne(csid);
            redisUtil.lSet(key+csid,classSub,60);
            return classSub;
        }
    }

    @PostMapping("/insertClassSub")
    @ApiOperation(value = "新增班级科目")
    public ClassSub insert(ClassSub classSub) {
        return feign.insert(classSub);
    }

    @PostMapping("/updateClassSub")
    @ApiOperation(value = "修改班级科目")
    public ClassSub update(ClassSub classSub) {
        return feign.update(classSub);
    }

    @GetMapping("/deleteClassSub")
    @ApiOperation(value = "删除班级科目")
    public boolean delete(Integer csid) {
        return feign.delete(csid);
    }

    @GetMapping("/getClassSubByCid")
    public List<Object> getClassSubByCid(Integer cid,@RequestParam(value = "key",defaultValue = "classSub") String key) {
        List<Object> list = redisUtil.lGet(key + cid, 0, -1);
        if (list != null && list.size() != 0){
            return list;
        }else{
            List<Object> classSubs = Collections.singletonList(feign.getClassSubByCid(cid));
            redisUtil.lSet(key+cid,classSubs,60);
            return classSubs;
        }
    }
}
