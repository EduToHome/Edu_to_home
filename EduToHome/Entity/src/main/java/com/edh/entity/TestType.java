package com.edh.entity;

import java.io.Serializable;

/**
 * (TestType)实体类
 *
 * @author makejava
 * @since 2020-12-11 22:25:33
 */
public class TestType implements Serializable {
    private static final long serialVersionUID = 986873912589716280L;

    private Integer ttid;

    private String ttname;


    public Integer getTtid() {
        return ttid;
    }

    public void setTtid(Integer ttid) {
        this.ttid = ttid;
    }

    public String getTtname() {
        return ttname;
    }

    public void setTtname(String ttname) {
        this.ttname = ttname;
    }

}