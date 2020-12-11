package com.edh.entity;

import java.io.Serializable;

/**
 * (Test)实体类
 *
 * @author makejava
 * @since 2020-12-10 19:58:03
 */
public class Test implements Serializable {
    private static final long serialVersionUID = 294060253974840010L;
    /**
     * 试卷编号
     */
    private Integer teid;
    /**
     * 考试类型编号
     */
    private Integer ttid;
    /**
     * 科目编号
     */
    private Integer suid;
    /**
     * 出题老师编号
     */
    private Integer tid;


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