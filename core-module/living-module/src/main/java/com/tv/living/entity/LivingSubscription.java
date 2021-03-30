package com.tv.living.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 直播订阅
 * </p>
 *
 * @author jobob
 * @since 2021-03-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class LivingSubscription implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer roomCode;

    private Integer userId;


}
