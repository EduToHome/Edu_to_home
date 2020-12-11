package com.edh.controller;


import com.edh.entity.Award;
import com.edh.service.AwardService;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (Award)表控制层
 *
 * @author makejava
 * @since 2020-11-12 17:36:53
 */
@RestController
@RequestMapping("award")
//@Api(tags = "员工奖罚表相关接口")
public class AwardController {
    /**
     * 服务对象
     */
    @Resource
    private AwardService awardService;



//    @ApiOperation(value = "查询所有奖惩表信息")
    @GetMapping("queryGetAll")
    public List<Award> queryGetAll() {
        return this.awardService.queryGetAll();
    }

}