package com.tv.living.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tv.living.entity.LivingSportsMatch;
import com.tv.living.generator.Result;
import com.tv.living.generator.ResultGenerator;
import com.tv.living.service.ILivingSportsMatchService;
import com.tv.living.vo.match.MatchVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2021-03-22
 */
@RestController
@RequestMapping("/match")
public class LivingSportsMatchController {


    @Autowired
    private ILivingSportsMatchService matchService;

    /**
     * 查询比赛列表
     * @return
     */
    public Result queryMatchList(@Validated MatchVo matchVo){
        PageHelper.startPage(matchVo.getPageNum(),matchVo.getPageSize());
        List<LivingSportsMatch> list = matchService.queryMatchList(matchVo);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.success(pageInfo);
    }




}
