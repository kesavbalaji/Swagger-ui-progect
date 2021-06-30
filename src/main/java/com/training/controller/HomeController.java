package com.training.controller;


import com.training.specifications.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/greetings")
    public String home(@RequestParam(name = "name",defaultValue = "world") String name){
        return  String.format("Hello, %s",name);
    }

    @GetMapping("/greet")
    public String testing(){
        return loginService.login();
    }


}
