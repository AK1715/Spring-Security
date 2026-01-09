package com.spring_security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

@Component
public class JwtUtils {

    private String jwtSecret = "a-string-secret-at-least-256-bits-long";
    private int jwtExpirations = 172800000;

    public String getJwtFromHeader(){
        return "";
    }

    public String generateTokenFromHeader(String userName){
        return Jwts.builder()
                .subject(userName)
                .issuedAt(new Date())
                .expiration(new Date(new Date().getTime() + jwtExpirations))
                .signWith(key())
                .compact();
    }

    public Boolean validateJwtToken(){
        return true;
    }

    public Key key(){
        return Keys.hmacShaKeyFor(Decoders.BASE64.decode(jwtSecret));
    }

}
