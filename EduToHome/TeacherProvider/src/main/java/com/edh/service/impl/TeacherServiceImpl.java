package com.edh.service.impl;

import com.edh.dao.TeacherDao;
import com.edh.entity.Teacher;
import com.edh.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Teacher)表服务实现类
 *
 * @author makejava
 * @since 2020-12-11 22:57:09
 */
@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {
    @Resource
    private TeacherDao teacherDao;

    /**
     * 通过ID查询单条数据
     *
     * @param tid 主键
     * @return 实例对象
     */
    @Override
    public Teacher queryById(Integer tid) {
        return this.teacherDao.queryById(tid);
    }

    /**
     * 查询所有的老师
     * @return 教师列表
     */
    @Override
    public List<Teacher> queryAll() {
        return teacherDao.queryAll();
    }

    /**
     * 新增数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    @Override
    public Teacher insert(Teacher teacher) {
        this.teacherDao.insert(teacher);
        return teacher;
    }

    /**
     * 修改数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    @Override
    public Teacher update(Teacher teacher) {
        this.teacherDao.update(teacher);
        return this.queryById(teacher.getTid());
    }

    /**
     * 通过主键删除数据
     *
     * @param tid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer tid) {
        return this.teacherDao.deleteById(tid) > 0;
    }

    /**
     * 通过uid删除
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteByUid(Integer uid) {
        return teacherDao.deleteByUid(uid)>0;
    }
}