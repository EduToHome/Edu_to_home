package com.edh.dao;

import com.edh.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Test)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-12 10:14:34
 */
@Mapper
public interface TestDao {

    /**
     * 通过ID查询单条数据
     *
     * @param teid 主键
     * @return 实例对象
     */
    Test queryById(Integer teid);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param test 实例对象
     * @return 对象列表
     */
    List<Test> queryAll(Test test);

    /**
     * 新增数据
     *
     * @param test 实例对象
     * @return 影响行数
     */
    int insert(Test test);

    /**
     * 修改数据
     *
     * @param test 实例对象
     * @return 影响行数
     */
    int update(Test test);

    /**
     * 通过主键删除数据
     *
     * @param teid 主键
     * @return 影响行数
     */
    int deleteById(Integer teid);

}