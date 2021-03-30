package com.fc.bot.task.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CompanyJobDto implements Serializable {

    private Integer id;

    /**
     * 公司
     */
    private String company;

    /**
     * 福利
     */
    private String welfare;

    /**
     * 职位
     */
    private String jobs;

    /**
     * 位置
     */
    private String position;

    /**
     * 详情
     */
    private String content;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 状态
     */
    private Integer state;

    /**
     * 原文地址
     */
    private String url;



}