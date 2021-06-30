package com.training.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.PostConstruct;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {


    @PostConstruct
    public void init(){
        System.out.printf("Hi Herll");
    }
    @Override
    public void addInterceptors(final InterceptorRegistry registry) {
        WebMvcConfigurer.super.addInterceptors(registry);
       // registry.addInterceptor(new GeneralPurposeInterceptor());
        registry.addInterceptor(new GeneralPurposeInterceptor()).addPathPatterns("/products/**");
    }
}
