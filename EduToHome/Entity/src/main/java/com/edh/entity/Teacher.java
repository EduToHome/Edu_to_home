package com.edh.entity;

import javax.security.auth.Subject;
import java.io.Serializable;

/**
 * (Teacher)实体类
 *
 * @author makejava
 * @since 2020-12-10 19:58:03
 */
public class Teacher implements Serializable {
    private static final long serialVersionUID = 140478634158380166L;
    /**
     * 老师编号
     */
    private Integer tid;
    /**
     * 科目编号
     */
    private Integer suid;

    private Subject subject;
    /**
     * 用户编号
     */
    private Integer uid;


    private Users users;
    /**
     * 学历
     */
    private String tedu;
    /**
     * 老师简介
     */
    private String tdesc;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getSuid() {
        return suid;
    }

    public void setSuid(Integer suid) {
        this.suid = suid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getTedu() {
        return tedu;
    }

    public void setTedu(String tedu) {
        this.tedu = tedu;
    }

    public String getTdesc() {
        return tdesc;
    }

    public void setTdesc(String tdesc) {
        this.tdesc = tdesc;
    }

}