package com.edh.dao;

import com.edh.entity.StudentContent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (StudentContent)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-14 15:31:49
 */
@Mapper
public interface StudentContentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param scid 主键
     * @return 实例对象
     */
    StudentContent queryById(Integer scid);


    StudentContent queryByStid(Integer stid);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param studentContent 实例对象
     * @return 对象列表
     */
    List<StudentContent> queryAll(StudentContent studentContent);

    /**
     * 新增数据
     *
     * @param studentContent 实例对象
     * @return 影响行数
     */
    int insert(StudentContent studentContent);


    /**
     * 修改数据
     *
     * @param studentContent 实例对象
     * @return 影响行数
     */
    int update(StudentContent studentContent);

    /**
     * 通过主键删除数据
     *
     * @param scid 主键
     * @return 影响行数
     */
    int deleteById(Integer scid);

}