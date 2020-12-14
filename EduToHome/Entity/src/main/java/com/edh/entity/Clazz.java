package com.edh.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Class)实体类
 *
 * @author makejava
 * @since 2020-12-11 22:25:32
 */
@Data
public class Clazz implements Serializable {
    private static final long serialVersionUID = 154133800955912509L;
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

    private Teacher teacher;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

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