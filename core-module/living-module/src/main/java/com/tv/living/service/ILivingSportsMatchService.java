package com.tv.living.service;

import com.tv.living.entity.LivingSportsMatch;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tv.living.vo.match.MatchVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2021-03-22
 */
public interface ILivingSportsMatchService extends IService<LivingSportsMatch> {

    /**
     * 列表
     * @param matchVo
     * @return
     */
    public List<LivingSportsMatch> queryMatchList(MatchVo matchVo);
}
