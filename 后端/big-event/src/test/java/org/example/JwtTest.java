package org.example;


import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Unit test for simple App.
 */
public class JwtTest
{
    @Test
    public void testGen(){
        Map<String,Object> claims =new HashMap<>();
        claims.put("id",1);
        claims.put("username","张三");
        String token = JWT.create()
                .withClaim("name",claims )
                .withExpiresAt(new Date(System.currentTimeMillis()+1000*60*60*24))
                .sign(Algorithm.HMAC256("itheima1"));//配置密钥
        System.out.println(token);
    }

    @Test
    public void testParse(){
//        String token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjp7ImlkIjoxLCJ1c2VybmFtZSI6IuW8oOS4iSJ9LCJleHAiOjE3Mzk4ODU1NTR9.joI0h7Pe-xpTsRSkb13zUMb3WrXfcitJ2nN69SzHydQ";
//        JWTVerifier jwtVerifier =JWT.require(Algorithm.HMAC256("itheima1")).build();
//        DecodedJWT decodedJWT =jwtVerifier.verify(token);
//        Map<String, Claim> claims= decodedJWT.getClaims();
//        System.out.println(claims.get("name"));
    }

}
