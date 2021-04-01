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

    private String homeIcon;

    /**
     * 客队
     */
    private String awayTeam;

    private String awayCode;

    private String awayIcon;

    /**
     * 比赛时间
     */
    private LocalDateTime competingTime;

    /**
     * 赛事类别,电竞,足球,篮球
     */
    private String category;

    /**
     * 二级分类,电竞(lol,csgo),足球(西甲,英甲)
     */
    private String category2;

    /**
     * 直播地址
     */
    private String streamUrl;

    /**
     * 装填
     */
    private Integer sate;


}
