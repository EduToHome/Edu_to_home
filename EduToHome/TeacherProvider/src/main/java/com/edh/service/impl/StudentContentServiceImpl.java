package com.edh.service.impl;

import com.edh.dao.StudentContentDao;
import com.edh.entity.StudentContent;
import com.edh.service.StudentContentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (StudentContent)表服务实现类
 *
 * @author makejava
 * @since 2020-12-14 15:31:50
 */
@Service("studentContentService")
public class StudentContentServiceImpl implements StudentContentService {
    @Resource
    private StudentContentDao studentContentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param scid 主键
     * @return 实例对象
     */
    @Override
    public StudentContent queryById(Integer scid) {
        return this.studentContentDao.queryById(scid);
    }

    /**
     * 新增数据
     *
     * @param studentContent 实例对象
     * @return 实例对象
     */
    @Override
    public StudentContent insert(StudentContent studentContent) {
        this.studentContentDao.insert(studentContent);
        return studentContent;
    }

    /**
     * 修改数据
     *
     * @param studentContent 实例对象
     * @return 实例对象
     */
    @Override
    public StudentContent update(StudentContent studentContent) {
        this.studentContentDao.update(studentContent);
        return this.queryById(studentContent.getScid());
    }

    /**
     * 通过主键删除数据
     *
     * @param scid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer scid) {
        return this.studentContentDao.deleteById(scid) > 0;
    }


    //根据某些字段来查询学生试卷内容集合
    @Override
    public List<StudentContent> queryAll(StudentContent studentContent) {
        return studentContentDao.queryAll(studentContent);
    }
}