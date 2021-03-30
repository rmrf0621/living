package com.tv.living.shiro.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 * @author huwen
 */
public class JwtUtils {
    /**
     * 设置过期时间半个小时
     */
    public static final long EXPIRE_TIME = 1000* 60 * 30;
    /**
     * 设置密钥
     */
//    public static final String SECRET = "shiro+jwt";



    /**
     * 根据用户名创建一个token
     * @param username 用户名
     * @return 返回的token字符串
     */
    public static String createToken(String username,String secret){
        //将当前时间的毫秒数和设置的过期时间相加生成一个新的时间
        Date date = new Date(System.currentTimeMillis()+EXPIRE_TIME);
        //由密钥创建一个指定的算法
        Algorithm algorithm = Algorithm.HMAC256(secret);
        return JWT.create()
                //附带username信息
                .withClaim("username",username)
                //附带过期时间
                .withExpiresAt(date)
                //使用指定的算法进行标记
                .sign(algorithm);
    }


    /**
     * 校验token是否正确
     *
     * @param token  密钥
     * @param secret 用户的密码
     * @return 是否正确
     */
    public static boolean verify(String token, String username, String secret) {
        try {
            // 根据密码生成JWT效验器
            Algorithm algorithm = Algorithm.HMAC256(secret);
            JWTVerifier verifier = JWT.require(algorithm).withClaim("username", username).build();
            // 效验TOKEN
            DecodedJWT jwt = verifier.verify(token);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    /**
     * 从token中获得username，无需secret
     * @param token token
     * @return username
     */
    public static String getUsername(String token){
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("username").asString();
        } catch (JWTDecodeException e) {
            return null;
        }
    }

    /**
     * 获得token中的自定义信息，无需secret解密也能获得
     */
    public static String getClaimFiled(String token, String filed) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim(filed).asString();
        } catch (JWTDecodeException e) {
            return null;
        }
    }




    public static void main(String[] args) {
        System.out.println(createToken("charlie","abcd"));
    }
}