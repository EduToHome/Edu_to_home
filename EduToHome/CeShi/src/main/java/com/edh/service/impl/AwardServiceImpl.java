package com.edh.service.impl;


import com.edh.entity.Award;
import com.edh.dao.AwardDao;
import com.edh.service.AwardService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Award)表服务实现类
 *
 * @author makejava
 * @since 2020-11-12 17:36:53
 */
@Service("awardService")
public class AwardServiceImpl implements AwardService {
    @Resource
    private AwardDao awardDao;

    /**
     * 通过ID查询单条数据
     *
     * @param aid 主键
     * @return 实例对象
     */
    @Override
    public Award queryById(Integer aid) {
        return this.awardDao.queryById(aid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Award> queryAllByLimit(int offset, int limit) {
        return this.awardDao.queryAllByLimit(offset, limit);
    }


    @Override
    public int insert(String adate,String adesc,Integer apoint,Integer eid) {

        return this.awardDao.insert(adate,adesc,apoint,eid);

    }

    @Override
    public Award update(Integer aid,String adate,String adesc,Integer apoint,Integer eid) {
        this.awardDao.update(aid,adate,adesc,apoint,eid);
        return this.queryById(aid);
    }

    /**
     * 通过主键删除数据
     *
     * @param aid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer aid) {
        return this.awardDao.deleteById(aid) > 0;
    }

    @Override
    public List<Award> queryByEId(Integer eid) {
        return awardDao.queryByEId(eid);
    }

    @Override
    public List<Award> queryGetAll() {
        return awardDao.queryGetAll();
    }
}