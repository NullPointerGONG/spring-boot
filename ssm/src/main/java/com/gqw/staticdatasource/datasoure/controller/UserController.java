package com.gqw.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    @ResponseBody
    public String syaHello() {
        return "hello spring boot";
    }
}
