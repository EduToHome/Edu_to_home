package com.edh.entity;

import java.io.Serializable;

/**
 * (Student)实体类
 *
 * @author makejava
 * @since 2020-12-11 22:25:33
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 627947160754042425L;
    /**
     * 学生编号
     */
    private Integer sid;
    /**
     * 学生姓名
     */
    private String sname;
    /**
     * 学生性别
     */
    private String sex;
    /**
     * 班级编号
     */
    private Integer cid;
    /**
     * 用户编号
     */
    private Integer uid;
    /**
     * 家长编号
     */
    private Integer pid;


    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

}