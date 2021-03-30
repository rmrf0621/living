package com.tv.living.controller;


import cn.hutool.core.util.StrUtil;
import com.tv.living.entity.LivingUser;
import com.tv.living.generator.Result;
import com.tv.living.generator.ResultGenerator;
import com.tv.living.service.ILivingUserService;
import com.tv.living.service.impl.LivingUserServiceImpl;
import com.tv.living.shiro.util.JwtUtils;
import com.tv.living.vo.user.UserRegistVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2021-03-22
 */
@RestController
@RequestMapping("/user/")
public class LivingUserController {



    @Autowired
    private ILivingUserService iLivingUserService;

    /**
     * 用户登录 密码不能明文传输,使用RSA加密
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/login")
    public Result login(String username,String password){
        LivingUser user = iLivingUserService.queryByUsername(username);
        if(StrUtil.isEmptyIfStr(user)){
            return ResultGenerator.fail("用户名或密码错误");
        }
        if(!user.getPassword().equals(password)){
            return ResultGenerator.fail("用户名或密码错误");
        }
        String token = JwtUtils.createToken(username,password);
        return ResultGenerator.success(token);
    }


    /**
     * 用户注册
     * @param registVO
     * @return
     */
    @RequestMapping("/register")
    public Result register(@Validated UserRegistVO registVO){
        LivingUser user = iLivingUserService.queryByUsername(registVO.getUsername());
        if(!StrUtil.isEmptyIfStr(user)){
            return ResultGenerator.fail("用户名已存在");
        }
        // 验证注册码 ,之后注册
        iLivingUserService.register(registVO);
        String token = JwtUtils.createToken(registVO.getUsername(),registVO.getPassword());
        return ResultGenerator.success(token);
    }
}
