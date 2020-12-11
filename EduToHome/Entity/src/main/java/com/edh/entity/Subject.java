package com.edh.entity;

import java.io.Serializable;

/**
 * (Subject)实体类
 *
 * @author makejava
 * @since 2020-12-10 19:58:03
 */
public class Subject implements Serializable {
    private static final long serialVersionUID = -70689182784178739L;

    private Integer suid;

    private String suname;

    private String sudesc;


    public Integer getSuid() {
        return suid;
    }

    public void setSuid(Integer suid) {
        this.suid = suid;
    }

    public String getSuname() {
        return suname;
    }

    public void setSuname(String suname) {
        this.suname = suname;
    }

    public String getSudesc() {
        return sudesc;
    }

    public void setSudesc(String sudesc) {
        this.sudesc = sudesc;
    }

}