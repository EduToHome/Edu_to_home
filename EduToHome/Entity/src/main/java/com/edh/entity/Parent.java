package com.edh.entity;

import java.io.Serializable;

/**
 * (Parent)实体类
 *
 * @author makejava
 * @since 2020-12-11 22:25:34
 */
public class Parent implements Serializable {
    private static final long serialVersionUID = -54588939179590645L;
    /**
     * 家长编号
     */
    private Integer pid;
    /**
     * 用户编号
     */
    private Integer uid;
    /**
     * 家庭地址
     */
    private String paddrs;
    /**
     * 家长简介
     */
    private String pdesc;


    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getPaddrs() {
        return paddrs;
    }

    public void setPaddrs(String paddrs) {
        this.paddrs = paddrs;
    }

    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc;
    }

}