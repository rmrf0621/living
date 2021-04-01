package com.tv.living.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tv.living.entity.LivingRoom;
import com.tv.living.entity.LivingSportsMatch;
import com.tv.living.generator.Result;
import com.tv.living.generator.ResultGenerator;
import com.tv.living.service.ILivingRoomService;
import com.tv.living.service.impl.LivingRoomServiceImpl;
import com.tv.living.vo.match.MatchVo;
import com.tv.living.vo.room.LiveVo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 房间 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2021-03-22
 */
@RestController
@RequestMapping("/room")
public class LivingRoomController {

    private ILivingRoomService roomService;

    /**
     * 查询直播列表
     * @return
     */
    public Result queryLivelist(@Validated LiveVo liveVo){
        PageHelper.startPage(liveVo.getPageNum(),liveVo.getPageSize());
        List<LivingRoom> list = roomService.queryLivelist(liveVo);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.success(pageInfo);
    }

}
