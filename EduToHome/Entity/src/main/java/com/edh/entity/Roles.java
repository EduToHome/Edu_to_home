package com.edh.entity;

import java.io.Serializable;

/**
 * (Roles)实体类
 *
 * @author makejava
 * @since 2020-12-11 22:25:35
 */
public class Roles implements Serializable {
    private static final long serialVersionUID = 280438932858781892L;
    /**
     * 角色编号
     */
    private Integer rid;
    /**
     * 角色名称
     */
    private String rname;


    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

}