package com.edh.dao;

import com.edh.entity.ClassSub;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (ClassSub)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-14 16:29:34
 */
public interface ClassSubDao {

    List<ClassSub> getClassSubByCid(Integer cid);

    /**
     * 通过ID查询单条数据
     *
     * @param csid 主键
     * @return 实例对象
     */
    ClassSub queryById(Integer csid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ClassSub> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param classSub 实例对象
     * @return 对象列表
     */
    List<ClassSub> queryAll(ClassSub classSub);

    /**
     * 新增数据
     *
     * @param classSub 实例对象
     * @return 影响行数
     */
    int insert(ClassSub classSub);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<ClassSub> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ClassSub> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<ClassSub> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<ClassSub> entities);

    /**
     * 修改数据
     *
     * @param classSub 实例对象
     * @return 影响行数
     */
    int update(ClassSub classSub);

    /**
     * 通过主键删除数据
     *
     * @param csid 主键
     * @return 影响行数
     */
    int deleteById(Integer csid);

}