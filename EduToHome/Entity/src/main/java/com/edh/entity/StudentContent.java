package com.edh.entity;

import java.io.Serializable;

/**
 * (StudentContent)实体类
 *
 * @author makejava
 * @since 2020-12-11 22:25:34
 */
public class StudentContent implements Serializable {
    private static final long serialVersionUID = 387930967269029386L;
    /**
     * 学生答题后试卷内容编号
     */
    private Integer scid;
    /**
     * 学生编号
     */
    private Integer stid;
    /**
     * 考试题目
     */
    private String topic;
    /**
     * 题目答案
     */
    private String answer;
    /**
     * 每道题目的分数
     */
    private Integer score;


    public Integer getScid() {
        return scid;
    }

    public void setScid(Integer scid) {
        this.scid = scid;
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

}