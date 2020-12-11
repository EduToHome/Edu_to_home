package com.edh.controller;

import com.edh.entity.Award;

import com.edh.util.RedisUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.experimental.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * (Award)表控制层
 *
 * @author makejava
 * @since 2020-11-12 17:36:53
 */
@RestController
@RequestMapping("award")
@Api(tags = "员工奖罚表相关接口")
public class AwardController {
    @Autowired
    private RestTemplate restTemplate;

    @ApiOperation(value = "查询所有奖惩表信息")
    @GetMapping("queryGetAll")
    public String queryGetAll() {
        return restTemplate.getForObject("http://ceshi/award/queryGetAll",String.class);

    }


    private static int ExpireTime = 60;   // redis中存储的过期时间60s

    @Resource
    private RedisUtil redisUtil;

    @GetMapping("listGet")
    public Object GetAll(@RequestParam(value = "key", defaultValue = "users") String key){
        List<Object> list = redisUtil.lGet(key, 0, 2);
        System.out.println(key + "\t" + list);
        if(list != null && list.size() != 0){
            return list;
        }else {
            String s = restTemplate.getForObject("http://ceshi/award/queryGetAll", String.class);

            System.out.println("users: " + s);
            redisUtil.lSet(key, s,20);
            return s;
        }
    }

}