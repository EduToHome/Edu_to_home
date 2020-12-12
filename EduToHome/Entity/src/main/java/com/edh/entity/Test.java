package com.edh.entity;

import java.io.Serializable;
import java.util.List;

/**
 * (Test)实体类
 *
 * @author makejava
 * @since 2020-12-11 22:25:34
 */
public class Test implements Serializable {
    private static final long serialVersionUID = 517554121240712606L;
    /**
     * 试卷编号
     */
    private Integer teid;
    /**
     * 考试类型编号
     */
    private Integer ttid;

    //试卷类型实体类
    private TestType testType;
    /**
     * 科目编号
     */
    private Integer suid;

    //科目实体类
    private Subject subject;
    /**
     * 出题老师编号
     */
    private Integer tid;

    //教师实体类
    private Teacher teacher;

    //试卷内容实体类
    private List<Content> contents;




    public Integer getTeid() {
        return teid;
    }

    public void setTeid(Integer teid) {
        this.teid = teid;
    }

    public Integer getTtid() {
        return ttid;
    }

    public void setTtid(Integer ttid) {
        this.ttid = ttid;
    }

    public Integer getSuid() {
        return suid;
    }

    public void setSuid(Integer suid) {
        this.suid = suid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

}