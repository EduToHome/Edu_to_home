package com.edh.entity;

import java.io.Serializable;

/**
 * (Content)实体类
 *
 * @author makejava
 * @since 2020-12-11 22:25:31
 */
public class Content implements Serializable {
    private static final long serialVersionUID = 493494286985857749L;
    /**
     * 试卷内容编号
     */
    private Integer coid;
    /**
     * 所属试卷编号
     */
    private Integer teid;
    /**
     * 题目内容
     */
    private String topic;


    public Integer getCoid() {
        return coid;
    }

    public void setCoid(Integer coid) {
        this.coid = coid;
    }

    public Integer getTeid() {
        return teid;
    }

    public void setTeid(Integer teid) {
        this.teid = teid;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

}