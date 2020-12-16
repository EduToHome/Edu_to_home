package com.edh.dao;

import com.edh.entity.Clazz;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Clazz)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-14 15:13:45
 */
public interface ClazzDao {

    /**
     * 通过ID查询单条数据
     *
     * @param cid 主键
     * @return 实例对象
     */
    Clazz queryById(Integer cid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Clazz> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param clazz 实例对象
     * @return 对象列表
     */
    List<Clazz> queryAll(Clazz clazz);

    /**
     * 新增数据
     *
     * @param clazz 实例对象
     * @return 影响行数
     */
    int insert(Clazz clazz);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Clazz> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Clazz> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Clazz> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Clazz> entities);

    /**
     * 修改数据
     *
     * @param clazz 实例对象
     * @return 影响行数
     */
    int update(Clazz clazz);

    /**
     * 通过主键删除数据
     *
     * @param cid 主键
     * @return 影响行数
     */
    int deleteById(Integer cid);

}