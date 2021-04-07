package com.tv.living.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2021-03-22
 */
@Data
@TableName("living_sports_match")
@EqualsAndHashCode(callSuper = false)
public class LivingSportsMatch implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 主队
     */
    private String homeTeam;

    private String homeCode;

    private String homeIcon;

    private String homeScore;


    /**
     * 客队
     */
    private String awayTeam;

    private String awayCode;

    private String awayIcon;

    private String awayScore;

    /**
     * 比赛时间
     */
    private LocalDateTime competingTime;

    private String startDate ;

    private String startTime;

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
     * 状态
     */
    private Integer state;


}
