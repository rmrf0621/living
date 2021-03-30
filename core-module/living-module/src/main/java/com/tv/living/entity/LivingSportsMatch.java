package com.tv.living.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2021-03-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class LivingSportsMatch implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主队
     */
    private String homeTeam;

    private String homeCode;

    /**
     * 客队
     */
    private String awayTeam;

    private String awayCode;

    /**
     * 比赛时间
     */
    private LocalDateTime competingTime;

    /**
     * 赛事类别
     */
    private String category;

    /**
     * 直播地址
     */
    private String streamUrl;

    /**
     * 装填
     */
    private Integer sate;


}
