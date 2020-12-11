package com.edh.entity;

import java.io.Serializable;

/**
 * (Class)实体类
 *
 * @author makejava
 * @since 2020-12-10 19:58:01
 */
public class Class implements Serializable {
    private static final long serialVersionUID = -30271483975195908L;
    /**
     * 班级编号
     */
    private Integer cid;
    /**
     * 班级名称
     */
    private String cname;
    /**
     * 班级简介
     */
    private String cdesc;
    /**
     * 班主任编号
     */
    private Integer tid;


    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCdesc() {
        return cdesc;
    }

    public void setCdesc(String cdesc) {
        this.cdesc = cdesc;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

}