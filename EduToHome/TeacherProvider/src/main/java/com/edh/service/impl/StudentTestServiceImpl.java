package com.edh.service.impl;

import com.edh.dao.StudentTestDao;
import com.edh.dao.SumScoreDao;
import com.edh.entity.StudentTest;
import com.edh.entity.SumScore;
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

    @Resource
    private SumScoreDao sumScoreDao;

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
        Integer sid = studentTest.getSid();
        Integer teid = studentTest.getTeid();
        //根据sid和teid查询单个对象
        StudentTest studentTest1 = studentTestDao.queryBySidAndTeid(sid, teid);
        Integer ttid = studentTest1.getTest().getTtid();
        //根据ttid查询成绩表
        SumScore sumScoreByTtid = sumScoreDao.getSumScoreByTtid(ttid);
        Integer sumsid = sumScoreByTtid.getSumsid();

        studentTest.setSumsid(sumsid);
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
        if (studentTest.getScore()!=null){
            Integer sumsid = studentTest.getSumsid();
            StudentTest studentTest1 = new StudentTest();
            studentTest1.setSumsid(sumsid);
            List<StudentTest> studentTests = studentTestDao.queryAll(studentTest1);
            int score=0;
            for (StudentTest test : studentTests) {
                Integer score1 = test.getScore();
                score+=score1;
            }
            SumScore sumScore = new SumScore();
            sumScore.setSumScore(score);
            sumScore.setSumsid(sumsid);
            sumScoreDao.update(sumScore);
        }
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