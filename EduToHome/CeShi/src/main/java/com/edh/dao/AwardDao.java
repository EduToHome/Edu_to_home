package com.edh.dao;


import com.edh.entity.Award;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Award)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-12 17:36:52
 */
public interface AwardDao {

    /**
     * 通过ID查询单条数据
     *
     * @param aid 主键
     * @return 实例对象
     */
    Award queryById(Integer aid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Award> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param award 实例对象
     * @return 对象列表
     */
    List<Award> queryAll(Award award);


    int insert(@Param("adate")String adate,
               @Param("adesc")String adesc,
               @Param("apoint")Integer apoint,
               @Param("eid")Integer eid);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Award> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Award> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Award> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Award> entities);


    int update(@Param("aid") Integer aid,
               @Param("adate")String adate,
               @Param("adesc")String adesc,
               @Param("apoint")Integer apoint,
               @Param("eid")Integer eid);

    /**
     * 通过主键删除数据
     *
     * @param aid 主键
     * @return 影响行数
     */
    int deleteById(Integer aid);

    List<Award> queryByEId(Integer eid);

    List<Award> queryGetAll();
}