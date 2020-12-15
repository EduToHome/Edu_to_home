package com.edh.service.impl;

import com.edh.dao.SumScoreDao;
import com.edh.entity.SumScore;
import com.edh.service.SumScoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (SumScore)表服务实现类
 *
 * @author makejava
 * @since 2020-12-15 10:03:59
 */
@Service("sumScoreService")
public class SumScoreServiceImpl implements SumScoreService {
    @Resource
    private SumScoreDao sumScoreDao;

    /**
     * 通过ID查询单条数据
     *
     * @param sumsid 主键
     * @return 实例对象
     */
    @Override
    public SumScore queryById(Integer sumsid) {
        return this.sumScoreDao.queryById(sumsid);
    }


    @Override
    public List<SumScore> queryAll(SumScore sumScore) {
        return sumScoreDao.queryAll(sumScore);
    }


    /**
     * 新增数据
     *
     * @param sumScore 实例对象
     * @return 实例对象
     */
    @Override
    public SumScore insert(SumScore sumScore) {
        this.sumScoreDao.insert(sumScore);
        return sumScore;
    }

    /**
     * 修改数据
     *
     * @param sumScore 实例对象
     * @return 实例对象
     */
    @Override
    public SumScore update(SumScore sumScore) {
        this.sumScoreDao.update(sumScore);
        return this.queryById(sumScore.getSumsid());
    }

    /**
     * 通过主键删除数据
     *
     * @param sumsid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer sumsid) {
        return this.sumScoreDao.deleteById(sumsid) > 0;
    }
}