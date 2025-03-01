package com.chen.cloudshadow.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Date;
/**
 * @author 32632
 * @date Created in 2025/2/10 18:48
 * @modified By  32632 in 2025/2/10 18:48
 * @description AddDescriptionHere
 */

/**
 * @description: TODO
 * @author 32632
 * @date 2025/2/10 18:48
 */
@Component
public class JwtUtil {
    private static final String SECRET_KEY = "wangchen";
    private static final long EXPIRATION_TIME = 864_000_000; // 10 days

    public static String generateToken(String usernameAndId) {
        return Jwts.builder()
                .setSubject(usernameAndId)
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS512, SECRET_KEY)
                .compact();
    }

    public static Claims getClaimsFromToken(String token) {
        return Jwts.parser()
                .setSigningKey(SECRET_KEY)
                .parseClaimsJws(token)
                .getBody();
    }

    public static String getUsernameFromToken(String token) {
        return getClaimsFromToken(token).getSubject();
    }

    public boolean isTokenExpired(String token) {
        return getClaimsFromToken(token).getExpiration().before(new Date());
    }
}
