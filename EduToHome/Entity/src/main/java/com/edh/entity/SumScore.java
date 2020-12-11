package com.edh.entity;

import java.io.Serializable;

/**
 * (SumScore)实体类
 *
 * @author makejava
 * @since 2020-12-10 19:58:03
 */
public class SumScore implements Serializable {
    private static final long serialVersionUID = 652073756744102410L;
    /**
     * 总成绩表编号
     */
    private Integer sumsid;
    /**
     * 学生编号
     */
    private Integer sid;
    /**
     * 班级编号
     */
    private Integer cid;
    /**
     * 考试类型编号
     */
    private Integer ttid;
    /**
     * 总成绩
     */
    private Integer sumScore;


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