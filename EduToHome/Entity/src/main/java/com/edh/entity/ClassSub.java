package com.edh.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (ClassSub)实体类
 *
 * @author makejava
 * @since 2020-12-11 22:25:34
 */
@Data
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

    private Clazz clazz;
    /**
     * 科目编号
     */
    private Integer suid;

    private Subject subject;
    /**
     * 老师编号
     */
    private Integer tid;

    private Teacher teacher;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

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