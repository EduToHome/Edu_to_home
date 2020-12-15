package com.edh.dao;

import com.edh.entity.StudentTest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (StudentTest)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-14 15:16:04
 */
@Mapper
public interface StudentTestDao {

    /**
     * 通过ID查询单条数据
     *
     * @param stid 主键
     * @return 实例对象
     */
    StudentTest queryById(Integer stid);


    List<StudentTest> queryBySid(Integer sid);
    /**
     * 通过实体作为筛选条件查询
     *
     * @param studentTest 实例对象
     * @return 对象列表
     */
    List<StudentTest> queryAll(StudentTest studentTest);


    StudentTest queryBySidAndTeid(@Param("sid") Integer sid,@Param("teid") Integer teid);
    /**
     * 新增数据
     *
     * @param studentTest 实例对象
     * @return 影响行数
     */
    int insert(StudentTest studentTest);

    /**
     * 修改数据
     *
     * @param studentTest 实例对象
     * @return 影响行数
     */
    int update(StudentTest studentTest);

    /**
     * 通过主键删除数据
     *
     * @param stid 主键
     * @return 影响行数
     */
    int deleteById(Integer stid);

}