package com.tv.living.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.tv.living.entity.LivingSportsMatch;
import com.tv.living.mapper.LivingSportsMatchMapper;
import com.tv.living.service.ILivingSportsMatchService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tv.living.vo.match.MatchVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2021-03-22
 */
@Service
public class LivingSportsMatchServiceImpl extends ServiceImpl<LivingSportsMatchMapper, LivingSportsMatch> implements ILivingSportsMatchService {

    @Autowired
    LivingSportsMatchMapper matchMapper;

    @Override
    public List<LivingSportsMatch> queryMatchList(MatchVo matchVo) {
        QueryWrapper<LivingSportsMatch> qw = new QueryWrapper();
        if(!StrUtil.isEmpty(matchVo.getCategory())){
            qw.lambda().eq(LivingSportsMatch::getCategory,matchVo.getCategory());
        }
        if(!StrUtil.isEmpty(matchVo.getCategory2())){
            qw.lambda().eq(LivingSportsMatch::getCategory2,matchVo.getCategory2());
        }
        if(!StrUtil.isEmpty(matchVo.getTeamName())){
            qw.lambda().or().like(LivingSportsMatch::getHomeTeam,matchVo.getTeamName());
            qw.lambda().or().like(LivingSportsMatch::getAwayTeam,matchVo.getTeamName());
        }
        return matchMapper.selectList(qw);
    }
}
