package com.edh.service.impl;

import com.edh.dao.TestDao;
import com.edh.entity.Test;
import com.edh.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Test)表服务实现类
 *
 * @author makejava
 * @since 2020-12-12 10:14:35
 */
@Service("testService")
public class TestServiceImpl implements TestService {
    @Resource
    private TestDao testDao;

    /**
     * 通过ID查询单条数据
     *
     * @param teid 主键
     * @return 实例对象
     */
    @Override
    public Test queryById(Integer teid) {
        return this.testDao.queryById(teid);
    }

    /**
     *
     * @param test 实例对象
     * @return
     */
    @Override
    public List<Test> queryAll(Test test) {
        return testDao.queryAll(test);
    }

    /**
     * 新增数据
     *
     * @param test 实例对象
     * @return 实例对象
     */
    @Override
    public Test insert(Test test) {
        this.testDao.insert(test);
        return test;
    }

    /**
     * 修改数据
     *
     * @param test 实例对象
     * @return 实例对象
     */
    @Override
    public Test update(Test test) {
        this.testDao.update(test);
        return this.queryById(test.getTeid());
    }

    /**
     * 通过主键删除数据
     *
     * @param teid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer teid) {
        return this.testDao.deleteById(teid) > 0;
    }
}