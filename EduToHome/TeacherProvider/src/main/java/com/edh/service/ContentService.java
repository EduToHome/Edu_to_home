package com.edh.service;

import com.edh.entity.Content;

import java.util.List;

/**
 * (Content)表服务接口
 *
 * @author makejava
 * @since 2020-12-12 14:26:06
 */
public interface ContentService {

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
     * @return 实例对象
     */
    Content insert(Content content);

    /**
     * 修改数据
     *
     * @param content 实例对象
     * @return 实例对象
     */
    Content update(Content content);

    /**
     * 通过主键删除数据
     *
     * @param coid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer coid);

}