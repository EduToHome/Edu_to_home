package com.edh.service.impl;

import com.edh.dao.StudentDao;
import com.edh.dao.SumScoreDao;
import com.edh.dao.TestTypeDao;
import com.edh.entity.Student;
import com.edh.entity.SumScore;
import com.edh.entity.TestType;
import com.edh.service.TestTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TestType)表服务实现类
 *
 * @author makejava
 * @since 2020-12-15 11:29:41
 */
@Service("testTypeService")
public class TestTypeServiceImpl implements TestTypeService {
    @Resource
    private TestTypeDao testTypeDao;

    @Resource
    private StudentDao studentDao;

    @Resource
    private SumScoreDao sumScoreDao;

    /**
     * 通过ID查询单条数据
     *
     * @param ttid 主键
     * @return 实例对象
     */
    @Override
    public TestType queryById(Integer ttid) {
        return this.testTypeDao.queryById(ttid);
    }

    @Override
    public List<TestType> queryAll(TestType testType) {
        return testTypeDao.queryAll(testType);
    }


    /**
     * 新增数据
     *
     * @param testType 实例对象
     * @return 实例对象
     */
    @Override
    public TestType insert(TestType testType) {

        if (testTypeDao.insert(testType)>0) {
            List<Student> students = studentDao.queryAll(new Student());
            for (Student student : students) {
                //学生班级id
                Integer cid = student.getCid();
                //学生id
                Integer sid = student.getSid();
                //试卷类型id
                Integer ttid = testType.getTtid();

                SumScore sumScore = new SumScore();
                sumScore.setCid(cid);
                sumScore.setSid(sid);
                sumScore.setTtid(ttid);
                //新增成绩表, 无总成绩
                sumScoreDao.insert(sumScore);
            }
            return testType;
        }
        return null;
    }

    /**
     * 修改数据
     *
     * @param testType 实例对象
     * @return 实例对象
     */
    @Override
    public TestType update(TestType testType) {
        this.testTypeDao.update(testType);
        return this.queryById(testType.getTtid());
    }

    /**
     * 通过主键删除数据
     *
     * @param ttid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer ttid) {
        return this.testTypeDao.deleteById(ttid) > 0;
    }
}