package com.edh.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Award)实体类
 *
 * @author makejava
 * @since 2020-11-12 17:36:52
 */
@Data
public class Award implements Serializable {
    private static final long serialVersionUID = -33954894531455665L;
    /**
     * 奖罚编号
     */
    //ffff
    private Integer aid;
    /**
     * 奖罚日期
     */
    private String adate;
    /**
     * 奖罚描述
     */
    private String adesc;
    /**
     * 奖罚分数
     */
    private Integer apoint;
    /**
     * 员工编号
     */




}