package com.resfir.database.config;

import com.resfir.database.interceptor.JWTInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new JWTInterceptor())
                .addPathPatterns("/api/database/**")
                .addPathPatterns("/api/user/resetPassword")
                .addPathPatterns("/api/user/setLevel")
                .excludePathPatterns("/api/user/signup")
                .excludePathPatterns("/api/user/login")
                .excludePathPatterns("/api/user/getUsers");
    }

    @Bean
    public JWTInterceptor jwtInterceptor() {

        return new JWTInterceptor();
    }
}