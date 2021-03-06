package com.edh.dao;

import com.edh.entity.SumScore;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (SumScore)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-15 10:03:56
 */
@Mapper
public interface SumScoreDao {

    /**
     * 通过ID查询单条数据
     *
     * @param sumsid 主键
     * @return 实例对象
     */
    SumScore queryById(Integer sumsid);

    SumScore getSumScoreByTtid(Integer ttid);

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
     * @return 影响行数
     */
    int insert(SumScore sumScore);

    /**
     * 修改数据
     *
     * @param sumScore 实例对象
     * @return 影响行数
     */
    int update(SumScore sumScore);

    /**
     * 通过主键删除数据
     *
     * @param sumsid 主键
     * @return 影响行数
     */
    int deleteById(Integer sumsid);

}