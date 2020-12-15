package com.edh.service;

import com.edh.entity.SumScore;

import java.util.List;

/**
 * (SumScore)表服务接口
 *
 * @author makejava
 * @since 2020-12-15 10:03:58
 */
public interface SumScoreService {

    /**
     * 通过ID查询单条数据
     *
     * @param sumsid 主键
     * @return 实例对象
     */
    SumScore queryById(Integer sumsid);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param sumScore 实例对象
     * @return 对象列表
     */
    List<SumScore> queryAll(SumScore sumScore);

    /**
     * 新增数据
     *
     * @param sumScore 实例对象
     * @return 实例对象
     */
    SumScore insert(SumScore sumScore);

    /**
     * 修改数据
     *
     * @param sumScore 实例对象
     * @return 实例对象
     */
    SumScore update(SumScore sumScore);

    /**
     * 通过主键删除数据
     *
     * @param sumsid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer sumsid);

}