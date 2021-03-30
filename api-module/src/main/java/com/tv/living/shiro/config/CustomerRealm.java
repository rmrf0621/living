package com.tv.living.shiro.config;

import cn.hutool.core.util.StrUtil;
import com.tv.living.entity.LivingUser;
import com.tv.living.service.ILivingUserService;
import com.tv.living.shiro.util.JwtUtils;
import com.tv.living.shiro.util.TokenContast;
import com.tv.living.utils.RedisUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
public class CustomerRealm extends AuthorizingRealm {

    @Autowired
    ILivingUserService livingUserService;

    @Autowired
    private RedisUtil redisUtil;

    /**
     * 限定这个 Realm 只处理 UsernamePasswordToken
     */
    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JwtToken;
    }

    /**
     * 权限控制验证
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        LivingUser livingUser = (LivingUser) SecurityUtils.getSubject().getPrincipal();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        // 1是主播
        if("1".equals(livingUser.getType())){
            authorizationInfo.addRoles(Arrays.asList(new String[]{"anchor","registed"}));
        }else {
            //2 普通用户 注册用户
            authorizationInfo.addRole("registed");
        }
//        authorizationInfo.addRole();
//        authorizationInfo.addStringPermission();
        return authorizationInfo;
    }

    /**
     * 用户登录验证
     * @param authcToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {

//        JwtToken token = (JwtToken)authcToken;
//        // 用户名,密码
//        String username = (String)token.getPrincipal();
//        String password = new String(token.getPassword());
//        LivingUser livingUser = livingUserService.queryByUsername(username);
//
//        // 验证用户名密码是否正确
//        if(!StrUtil.isBlankIfStr(livingUser) && livingUser.getPassword().equals(password)){
//            SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
//                    livingUser, // 用户对象
//                    livingUser.getPassword(), // 密码
//                    getName() // realm name
//            );
//            return authenticationInfo;
//        }
//        return null;

        JwtToken token = (JwtToken)authcToken;
        // 用户名,密码
        String username = (String)token.getPrincipal();
        LivingUser livingUser = livingUserService.queryByUsername(username);
        if(!StrUtil.isEmptyIfStr(livingUser)){
            SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                    livingUser, // 用户对象
                    livingUser.getPassword(), // 密码
                    getName() // realm name
            );
            return authenticationInfo;
        }
        return null;
    }


    /**
     * JWTToken刷新生命周期 （解决用户一直在线操作，提供Token失效问题）
     * 1、登录成功后将用户的JWT生成的Token作为k、v存储到cache缓存里面(这时候k、v值一样)
     * 2、当该用户再次请求时，通过JWTFilter层层校验之后会进入到doGetAuthenticationInfo进行身份验证
     * 3、当该用户这次请求JWTToken值还在生命周期内，则会通过重新PUT的方式k、v都为Token值，缓存中的token值生命周期时间重新计算(这时候k、v值一样)
     * 4、当该用户这次请求jwt生成的token值已经超时，但该token对应cache中的k还是存在，则表示该用户一直在操作只是JWT的token失效了，程序会给token对应的k映射的v值重新生成JWTToken并覆盖v值，该缓存生命周期重新计算
     * 5、当该用户这次请求jwt在生成的token值已经超时，并在cache中不存在对应的k，则表示该用户账户空闲超时，返回用户信息已失效，请重新登录。
     * 6、每次当返回为true情况下，都会给Response的Header中设置Authorization，该Authorization映射的v为cache对应的v值。
     * 7、注：当前端接收到Response的Header中的Authorization值会存储起来，作为以后请求token使用
     * 参考方案：https://blog.csdn.net/qq394829044/article/details/82763936
     *
     * @param userName
     * @param passWord
     * @return
     */
    public boolean jwtTokenRefresh(String token, String userName, String passWord) {
        String cacheToken = String.valueOf(redisUtil.get(TokenContast.PREFIX_USER_TOKEN + userName));
        if (StrUtil.isNotEmpty(cacheToken)) {
            // 校验token有效性
            if (!JwtUtils.verify(cacheToken, userName, passWord)) {
                String newAuthorization = JwtUtils.createToken(userName, passWord);
                redisUtil.set(TokenContast.PREFIX_USER_TOKEN + userName, newAuthorization);
                // 设置超时时间
                redisUtil.expire(TokenContast.PREFIX_USER_TOKEN + userName, JwtUtils.EXPIRE_TIME / 1000);
            } else {
                redisUtil.set(TokenContast.PREFIX_USER_TOKEN + userName, cacheToken);
                // 设置超时时间
                redisUtil.expire(TokenContast.PREFIX_USER_TOKEN + userName, JwtUtils.EXPIRE_TIME / 1000);
            }
            return true;
        }
        return false;
    }


}
