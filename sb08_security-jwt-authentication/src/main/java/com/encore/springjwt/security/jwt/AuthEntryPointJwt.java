package com.encore.springjwt.security.jwt;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
	로그인이 올바르지 않을 경우 수행하는 동작을 Security의 AuthenticationEntryPoint 에서 정의
	동작을 사용자 정의로 변경 가능
*/
@Component
public class AuthEntryPointJwt implements AuthenticationEntryPoint { 

	private static final Logger logger = LoggerFactory.getLogger(AuthEntryPointJwt.class);

	@Override
	public void commence(
			HttpServletRequest request,
			HttpServletResponse response,
			AuthenticationException authException		// 로그인 만료 시간
	) throws IOException, ServletException {
		
		logger.error("Unauthorized error: {}", authException.getMessage());
		
		response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Error: Unauthorized");
	}

}
