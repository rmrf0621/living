package com.tv.living.service;

import com.tv.living.entity.LivingRoom;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tv.living.vo.room.LiveVo;

import java.util.List;

/**
 * <p>
 * 房间 服务类
 * </p>
 *
 * @author jobob
 * @since 2021-03-22
 */
public interface ILivingRoomService extends IService<LivingRoom> {

    /**
     * 直播房间列表
     * @param liveVo
     * @return
     */
    List<LivingRoom> queryLivelist(LiveVo liveVo);
}
