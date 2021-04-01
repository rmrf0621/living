package com.tv.living.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tv.living.entity.LivingUser;
import com.tv.living.mapper.LivingUserMapper;
import com.tv.living.service.ILivingUserService;
import com.tv.living.vo.user.UserRegistVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2021-03-22
 */
@Service
public class LivingUserServiceImpl extends ServiceImpl<LivingUserMapper, LivingUser> implements ILivingUserService {

    @Autowired
    LivingUserMapper livingUserMapper;


    @Override
    public LivingUser queryByUsername(String username) {
        return livingUserMapper.selectOne(new QueryWrapper<LivingUser>().lambda().eq(LivingUser::getUsername, username));
    }

    @Override
    public void register(UserRegistVO registVO) {

        LivingUser user = new LivingUser();
        user.setPassword(registVO.getPassword());
        user.setUsername(registVO.getPassword());
        user.setPhone(registVO.getPhone());
        user.setRegisterTime(LocalDateTime.now());
//        user.setState(Contanst.STATE.ENABLE);


    }
}
