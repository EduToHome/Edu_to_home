package com.edh.dao;

import com.edh.entity.TestType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TestType)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-15 11:29:40
 */
@Mapper
public interface TestTypeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param ttid 主键
     * @return 实例对象
     */
    TestType queryById(Integer ttid);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param testType 实例对象
     * @return 对象列表
     */
    List<TestType> queryAll(TestType testType);

    /**
     * 新增数据
     *
     * @param testType 实例对象
     * @return 影响行数
     */
    int insert(TestType testType);

    /**
     * 修改数据
     *
     * @param testType 实例对象
     * @return 影响行数
     */
    int update(TestType testType);

    /**
     * 通过主键删除数据
     *
     * @param ttid 主键
     * @return 影响行数
     */
    int deleteById(Integer ttid);

}