package com.edh.service;


import com.edh.entity.Award;

import java.util.List;

/**
 * (Award)表服务接口
 *
 * @author makejava
 * @since 2020-11-12 17:36:52
 */
public interface AwardService {

    /**
     * 通过ID查询单条数据
     *
     * @param aid 主键
     * @return 实例对象
     */
    Award queryById(Integer aid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Award> queryAllByLimit(int offset, int limit);


    int insert(String adate,String adesc,Integer apoint,Integer eid);


    Award update(Integer aid,String adate,String adesc,Integer apoint,Integer eid);

    /**
     * 通过主键删除数据
     *
     * @param aid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer aid);

    List<Award> queryByEId(Integer eid);

    List<Award> queryGetAll();
}