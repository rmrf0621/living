package com.tv.living.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tv.living.entity.LivingUser;
import com.tv.living.vo.user.UserRegistVO;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author jobob
 * @since 2021-03-22
 */
public interface ILivingUserService extends IService<LivingUser> {

    /**
     * 根据用户用户名查询
     *
     * @param username
     * @return
     */
    public LivingUser queryByUsername(String username);

    /**
     * 用户注册
     * @param registVO
     */
    public void register(UserRegistVO registVO);
}
