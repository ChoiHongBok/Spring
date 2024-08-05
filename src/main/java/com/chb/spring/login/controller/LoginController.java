package com.chb.spring.login.controller;

import com.chb.spring.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// Restuful 웹서비스의 컨트롤러 (@RestController = @Controller + @ResponseBody : 주 용도는 Json 형태로 객체 데이터 반환)
// @RestController

// Spring MVC 컨트롤러
@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/login")
    public String login() {
        return "";
    }

}
