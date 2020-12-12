package com.edh.entity;

import java.io.Serializable;

/**
 * (ClassSub)实体类
 *
 * @author makejava
 * @since 2020-12-11 22:25:34
 */
public class ClassSub implements Serializable {
    private static final long serialVersionUID = -86281390300330503L;
    /**
     * 班级科目编号
     */
    private Integer csid;
    /**
     * 班级编号
     */
    private Integer cid;
    /**
     * 科目编号
     */
    private Integer suid;
    /**
     * 老师编号
     */
    private Integer tid;


    public Integer getCsid() {
        return csid;
    }

    public void setCsid(Integer csid) {
        this.csid = csid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
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