package com.edh.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Student)实体类
 *
 * @author makejava
 * @since 2020-12-11 22:25:33
 */
@Data
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

    private Clazz clazz;
    /**
     * 用户编号
     */
    private Integer uid;

    private Users users;
    /**
     * 家长编号
     */
    private Integer pid;

    private Parent parent;

    public Student() {
    }

    public Student(Integer sid, String sname, String sex, Integer cid, Clazz clazz, Integer uid, Users users, Integer pid, Parent parent) {
        this.sid = sid;
        this.sname = sname;
        this.sex = sex;
        this.cid = cid;
        this.clazz = clazz;
        this.uid = uid;
        this.users = users;
        this.pid = pid;
        this.parent = parent;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

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