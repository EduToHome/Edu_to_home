package com.edh.service;

import com.edh.entity.StudentTest;

import java.util.List;

/**
 * (StudentTest)表服务接口
 *
 * @author makejava
 * @since 2020-12-14 15:16:04
 */
public interface StudentTestService {

    /**
     * 通过ID查询单条数据
     *
     * @param stid 主键
     * @return 实例对象
     */
    StudentTest queryById(Integer stid);



    List<StudentTest> queryAll(StudentTest studentTest);
    /**
     * 新增数据
     *
     * @param studentTest 实例对象
     * @return 实例对象
     */
    StudentTest insert(StudentTest studentTest);

    /**
     * 修改数据
     *
     * @param studentTest 实例对象
     * @return 实例对象
     */
    StudentTest update(StudentTest studentTest);

    /**
     * 通过主键删除数据
     *
     * @param stid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer stid);

}