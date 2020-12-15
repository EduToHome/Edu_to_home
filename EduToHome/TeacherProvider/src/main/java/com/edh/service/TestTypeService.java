package com.edh.service;

import com.edh.entity.TestType;

import java.util.List;

/**
 * (TestType)表服务接口
 *
 * @author makejava
 * @since 2020-12-15 11:29:41
 */
public interface TestTypeService {

    /**
     * 通过ID查询单条数据
     *
     * @param ttid 主键
     * @return 实例对象
     */
    TestType queryById(Integer ttid);


    List<TestType> queryAll(TestType testType);

    /**
     * 新增数据
     *
     * @param testType 实例对象
     * @return 实例对象
     */
    TestType insert(TestType testType);

    /**
     * 修改数据
     *
     * @param testType 实例对象
     * @return 实例对象
     */
    TestType update(TestType testType);

    /**
     * 通过主键删除数据
     *
     * @param ttid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer ttid);

}