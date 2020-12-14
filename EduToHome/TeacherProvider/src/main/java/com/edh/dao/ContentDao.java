package com.edh.dao;

import com.edh.entity.Content;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (Content)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-12 14:26:06
 */
@Mapper
public interface ContentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param coid 主键
     * @return 实例对象
     */
    Content queryById(Integer coid);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param content 实例对象
     * @return 对象列表
     */
    List<Content> queryAll(Content content);

    /**
     * 新增数据
     *
     * @param content 实例对象
     * @return 影响行数
     */
    int insert(Content content);

    /**
     * 修改数据
     *
     * @param content 实例对象
     * @return 影响行数
     */
    int update(Content content);

    /**
     * 通过主键删除数据
     *
     * @param coid 主键
     * @return 影响行数
     */
    int deleteById(Integer coid);

}