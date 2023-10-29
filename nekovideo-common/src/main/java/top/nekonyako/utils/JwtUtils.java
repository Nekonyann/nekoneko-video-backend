package top.nekonyako.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Copyright (C),2021-2023
 * All rights reserved.
 * FileName: JwtUtils
 *
 * @author NEKOnyako
 * Description:
 * Date: 2023/09/22 0022 10:21
 */


public class JwtUtils {

    /**
     *
     * @param id 用户id
     * @param username 用户username
     * @param secretKey jwt秘钥
     * @param expTime 过期时间(ms)
     * @return
     * @throws ExpiredJwtException
     */
    public static String createToken(Long id, String username, String secretKey, Long expTime) throws ExpiredJwtException {
        Map<String,Object> user = new HashMap<>();
        user.put("id",id);
        user.put("username",username);
        Key key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(secretKey));
        JwtBuilder jwtBuilder = Jwts.builder();
        String jwtToken = jwtBuilder
                .setHeaderParam("typ","JWT")
                .setHeaderParam("alg","HS256")
                .setClaims(user)
                .setExpiration(new Date(System.currentTimeMillis()+expTime))
                .signWith(key)
                .compact();
        return jwtToken;
    }

    /**
     * 解析 token
     * @param token 传过来的token
     * @param secretKey 加密秘钥
     * @return
     */
    public static Claims parseToken(String token, String secretKey) {
        Key key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(secretKey));
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody();
    }
}
