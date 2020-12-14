package com.edh.service;

import com.edh.entity.StudentContent;

import java.util.List;

/**
 * (StudentContent)表服务接口
 *
 * @author makejava
 * @since 2020-12-14 15:31:50
 */
public interface StudentContentService {

    /**
     * 通过ID查询单条数据
     *
     * @param scid 主键
     * @return 实例对象
     */
    StudentContent queryById(Integer scid);

    /**
     * 新增数据
     *
     * @param studentContent 实例对象
     * @return 实例对象
     */
    StudentContent insert(StudentContent studentContent);

    /**
     * 修改数据
     *
     * @param studentContent 实例对象
     * @return 实例对象
     */
    StudentContent update(StudentContent studentContent);

    /**
     * 通过主键删除数据
     *
     * @param scid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer scid);


    List<StudentContent> queryAll(StudentContent studentContent);

}