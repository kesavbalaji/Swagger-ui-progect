package com.training.controller;

import nonapi.io.github.classgraph.json.JSONUtils;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

//@Configuration
//@EnableWebSecurity
//@EnableOAuth2Sso
//@EnableOAuth2Client
public class AppSecurityConfig  /*extends WebSecurityConfigurerAdapter*/  {

//    @Override
//    protected void configure(HttpSecurity http) throws Exception{
//
//        http
//                .csrf().disable().authorizeRequests().antMatchers("/login").permitAll()
//                .anyRequest().authenticated();
//
//    }


}


