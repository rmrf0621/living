package com.tv.living.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tv.living.entity.LivingRoom;
import com.tv.living.mapper.LivingRoomMapper;
import com.tv.living.service.ILivingRoomService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tv.living.vo.room.LiveVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 房间 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2021-03-22
 */
@Service
public class LivingRoomServiceImpl extends ServiceImpl<LivingRoomMapper, LivingRoom> implements ILivingRoomService {


    @Autowired
    LivingRoomMapper liveMapper;

    @Override
    public List<LivingRoom> queryLivelist(LiveVo liveVo) {
        QueryWrapper<LivingRoom> qw = new QueryWrapper<LivingRoom>();
        if(!StrUtil.isEmpty(liveVo.getAnchor())){
            qw.lambda().eq(LivingRoom::getCategory,liveVo.getCategory());
        }
        if(!StrUtil.isEmpty(liveVo.getAnchor())){
            qw.lambda().eq(LivingRoom::getUserId,liveVo.getAnchor());
        }
        return liveMapper.selectList(qw);
    }
}
