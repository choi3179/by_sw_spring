package com.encore.springjwt.security;

import com.encore.springjwt.security.jwt.AuthEntryPointJwt;
import com.encore.springjwt.security.jwt.AuthTokenFilter;
import com.encore.springjwt.security.service.UserDetailsImpl;
import com.encore.springjwt.security.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity  // config 파일에 대해 security 메소드 활성화
public class WebSecurityConfig {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Autowired
    private AuthEntryPointJwt unauthorizedHandler;

    @Bean
    public AuthTokenFilter authenticationJwtTokenFilter(){
        return new AuthTokenFilter();
    }

    // 스프링에서 제공하는 패스워드 인코더 클래스
    //@Lazy
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(); // 암호화 객체
    }
}
