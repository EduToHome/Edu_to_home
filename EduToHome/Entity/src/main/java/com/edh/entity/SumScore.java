package com.edh.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * (SumScore)实体类
 *
 * @author makejava
 * @since 2020-12-11 22:25:33
 */
@Data
public class SumScore implements Serializable {
    private static final long serialVersionUID = -59823346401892812L;
    /**
     * 总成绩表编号
     */
    private Integer sumsid;
    /**
     * 学生编号
     */
    private Integer sid;

    private Student student;
    /**
     * 班级编号
     */
    private Integer cid;

    private Clazz clazz;
    /**
     * 考试类型编号
     */
    private Integer ttid;
    /**
     * 总成绩
     */
    private Integer sumScore;

    private List<StudentTest> studentTests;


    public List<StudentTest> getStudentTests() {
        return studentTests;
    }

    public void setStudentTests(List<StudentTest> studentTests) {
        this.studentTests = studentTests;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Integer getSumsid() {
        return sumsid;
    }

    public void setSumsid(Integer sumsid) {
        this.sumsid = sumsid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getTtid() {
        return ttid;
    }

    public void setTtid(Integer ttid) {
        this.ttid = ttid;
    }

    public Integer getSumScore() {
        return sumScore;
    }

    public void setSumScore(Integer sumScore) {
        this.sumScore = sumScore;
    }

}