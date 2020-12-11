package com.edh.entity;

import java.io.Serializable;

/**
 * (Users)实体类
 *
 * @author makejava
 * @since 2020-12-10 19:58:03
 */
public class Users implements Serializable {
    private static final long serialVersionUID = -90007740985394389L;
    /**
     * 用户编号
     */
    private Integer uid;
    /**
     * 角色编号
     */
    private Integer rid;
    /**
     * 用户姓名
     */
    private String username;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 用户电话
     */
    private String tell;
    /**
     * 用户邮箱
     */
    private String email;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}