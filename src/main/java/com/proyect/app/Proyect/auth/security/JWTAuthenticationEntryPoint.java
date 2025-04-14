package com.proyect.app.Proyect.auth.security;

import org.springframework.security.web.AuthenticationEntryPoint;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;

public class JWTAuthenticationEntryPoint  implements AuthenticationEntryPoint{
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        response.setStatus(HttpServletResponse.SC_FORBIDDEN);
        response.getWriter().write(new ObjectMapper().writeValueAsString("No access, "+authException.getMessage()));
    }
}
