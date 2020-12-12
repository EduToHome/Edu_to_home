package com.edh.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Message)实体类
 *
 * @author makejava
 * @since 2020-12-11 22:25:33
 */
public class Message implements Serializable {
    private static final long serialVersionUID = 787439375003157222L;
    /**
     * 留言板编号
     */
    private Integer mid;
    /**
     * 发件人id
     */
    private Integer sendUid;
    /**
     * 收件人id
     */
    private Integer receiveUid;
    /**
     * 留言内容
     */
    private String mdesc;
    /**
     * 留言时间
     */
    private Date mdate;


    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getSendUid() {
        return sendUid;
    }

    public void setSendUid(Integer sendUid) {
        this.sendUid = sendUid;
    }

    public Integer getReceiveUid() {
        return receiveUid;
    }

    public void setReceiveUid(Integer receiveUid) {
        this.receiveUid = receiveUid;
    }

    public String getMdesc() {
        return mdesc;
    }

    public void setMdesc(String mdesc) {
        this.mdesc = mdesc;
    }

    public Date getMdate() {
        return mdate;
    }

    public void setMdate(Date mdate) {
        this.mdate = mdate;
    }

}