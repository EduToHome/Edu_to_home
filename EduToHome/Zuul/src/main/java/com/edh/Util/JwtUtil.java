package com.edh.Util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;

/**
 * ?来?成签名，校验签名，通过签名
 * Created by jeffrey on 2020/5/31.
 */
public class JwtUtil {
    // 过期59分钟
    private static final long EXPIRE_TIME = 59 * 60 * 1000 ;
    // 密钥
    private static final String SECRET = "jwt_secret";
    /**
     * ?成签名，59分钟后过期
     * @param username
     * @return
     */
    public static String sign(String username){
        Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
        Algorithm algorithm = Algorithm.HMAC256(SECRET);
        JWTCreator.Builder builder = JWT.create();
// 将userId写?到Token中
        builder.withAudience(username);
// 设值token的?存期 5分钟后过期
        builder.withExpiresAt(date);
// 设值token的密钥
        String sign = builder.sign(algorithm);
// String sign1 = JWT.create()
// .withAudience(userId)
// .withExpiresAt(date)
// .sign(algorithm);
        return sign ;
    }
    /**
     * 从token中获取userId
     * @param token
     * @return
     */
    public static String getUserId(String token){
        String username = JWT.decode(token).getAudience().get(0);
        return username;
    }
    /**
     * 校验token
     * @param token
     * @return
     */
    public static boolean checkToken(String token){
        try {
            Algorithm algorithm = Algorithm.HMAC256(SECRET);
            JWTVerifier jwtVerifier = JWT.require(algorithm).build();
            DecodedJWT verify = jwtVerifier.verify(token);
            return true;
        }catch (JWTVerificationException ex){
            throw new RuntimeException("token expired");
        }

    }
}
