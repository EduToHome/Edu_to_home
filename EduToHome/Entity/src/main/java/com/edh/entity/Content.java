package com.edh.entity;

import java.io.Serializable;

/**
 * (Content)实体类
 *
 * @author makejava
 * @since 2020-12-10 19:58:02
 */
public class Content implements Serializable {
    private static final long serialVersionUID = -74596700930389292L;
    /**
     * 试卷内容编号
     */
    private Integer coid;
    /**
     * 所属试卷编号
     */
    private Integer teid;
    /**
     * 题目编号
     */
    private Integer topic;


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

    public Integer getTopic() {
        return topic;
    }

    public void setTopic(Integer topic) {
        this.topic = topic;
    }

}