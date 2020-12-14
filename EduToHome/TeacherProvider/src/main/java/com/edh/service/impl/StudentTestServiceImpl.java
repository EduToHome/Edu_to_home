package com.edh.service.impl;

import com.edh.dao.StudentTestDao;
import com.edh.entity.StudentTest;
import com.edh.service.StudentTestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (StudentTest)表服务实现类
 *
 * @author makejava
 * @since 2020-12-14 15:16:05
 */
@Service("studentTestService")
public class StudentTestServiceImpl implements StudentTestService {
    @Resource
    private StudentTestDao studentTestDao;

    /**
     * 通过ID查询单条数据
     *
     * @param stid 主键
     * @return 实例对象
     */
    @Override
    public StudentTest queryById(Integer stid) {
        return this.studentTestDao.queryById(stid);
    }


    @Override
    public List<StudentTest> queryAll(StudentTest studentTest) {
        return studentTestDao.queryAll(studentTest);
    }

    /**
     * 新增数据
     *
     * @param studentTest 实例对象
     * @return 实例对象
     */
    @Override
    public StudentTest insert(StudentTest studentTest) {
        this.studentTestDao.insert(studentTest);
        return studentTest;
    }

    /**
     * 修改数据
     *
     * @param studentTest 实例对象
     * @return 实例对象
     */
    @Override
    public StudentTest update(StudentTest studentTest) {
        this.studentTestDao.update(studentTest);
        return this.queryById(studentTest.getStid());
    }

    /**
     * 通过主键删除数据
     *
     * @param stid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer stid) {
        return this.studentTestDao.deleteById(stid) > 0;
    }
}