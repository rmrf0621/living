package com.tv.living.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 房间
 * </p>
 *
 * @author jobob
 * @since 2021-03-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class LivingRoom implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 房间编码
     */
    private String roomCode;

    /**
     * 房间标题,名字
     */
    private String roomName;

    /**
     * 直播分类
     */
    private String category;

    /**
     * 状态
     */
    private Integer state;

    /**
     * 订阅人数
     */
    private Integer booking;

    /**
     * 观看人数
     */
    private Integer viewers;

    /**
     * 推拉流地址
     */
    private String streamUrl;

    /**
     * 最近一次直播时间
     */
    private LocalDateTime lastLvingTime;


}
