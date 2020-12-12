package com.edh.entity;

import java.io.Serializable;

/**
 * (StudentTest)实体类
 *
 * @author makejava
 * @since 2020-12-11 22:25:35
 */
public class StudentTest implements Serializable {
    private static final long serialVersionUID = -45309553929086716L;
    /**
     * 学生试卷编号
     */
    private Integer stid;
    /**
     * 学生编号
     */
    private Integer sid;
    /**
     * 试卷编号
     */
    private Integer teid;
    /**
     * 班级编号
     */
    private Integer cid;
    /**
     * 答题状态
     */
    private Integer state;
    /**
     * 成绩
     */
    private Integer score;
    /**
     * 成绩表编号
     */
    private Integer sumsid;
    /**
     * 批阅状态
     */
    private Integer sover;


    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getTeid() {
        return teid;
    }

    public void setTeid(Integer teid) {
        this.teid = teid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getSumsid() {
        return sumsid;
    }

    public void setSumsid(Integer sumsid) {
        this.sumsid = sumsid;
    }

    public Integer getSover() {
        return sover;
    }

    public void setSover(Integer sover) {
        this.sover = sover;
    }

}