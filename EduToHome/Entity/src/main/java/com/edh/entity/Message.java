package com.edh.entity;

import java.io.Serializable;

/**
 * (Message)实体类
 *
 * @author makejava
 * @since 2020-12-10 19:58:02
 */
public class Message implements Serializable {
    private static final long serialVersionUID = 655433352549608590L;
    /**
     * 留言板编号
     */
    private Integer mid;
    /**
     * 发件人
     */
    private String sendUid;
    /**
     * 收件人
     */
    private String receiveUid;
    /**
     * 留言内容
     */
    private String mdesc;
    /**
     * 留言时间
     */
    private String mdate;


    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getSendUid() {
        return sendUid;
    }

    public void setSendUid(String sendUid) {
        this.sendUid = sendUid;
    }

    public String getReceiveUid() {
        return receiveUid;
    }

    public void setReceiveUid(String receiveUid) {
        this.receiveUid = receiveUid;
    }

    public String getMdesc() {
        return mdesc;
    }

    public void setMdesc(String mdesc) {
        this.mdesc = mdesc;
    }

    public String getMdate() {
        return mdate;
    }

    public void setMdate(String mdate) {
        this.mdate = mdate;
    }

}