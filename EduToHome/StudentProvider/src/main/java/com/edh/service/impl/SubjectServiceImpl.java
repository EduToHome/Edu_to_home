package com.edh.service.impl;

import com.edh.dao.SubjectDao;
import com.edh.entity.Subject;
import com.edh.service.SubjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Subject)表服务实现类
 *
 * @author makejava
 * @since 2020-12-14 16:28:45
 */
@Service("subjectService")
public class SubjectServiceImpl implements SubjectService {
    @Resource
    private SubjectDao subjectDao;

    /**
     * 通过ID查询单条数据
     *
     * @param suid 主键
     * @return 实例对象
     */
    @Override
    public Subject queryById(Integer suid) {
        return this.subjectDao.queryById(suid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Subject> queryAllByLimit(int offset, int limit) {
        return this.subjectDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param subject 实例对象
     * @return 实例对象
     */
    @Override
    public Subject insert(Subject subject) {
        this.subjectDao.insert(subject);
        return subject;
    }

    /**
     * 修改数据
     *
     * @param subject 实例对象
     * @return 实例对象
     */
    @Override
    public Subject update(Subject subject) {
        this.subjectDao.update(subject);
        return this.queryById(subject.getSuid());
    }

    /**
     * 通过主键删除数据
     *
     * @param suid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer suid) {
        return this.subjectDao.deleteById(suid) > 0;
    }
}