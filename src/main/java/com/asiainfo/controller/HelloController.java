package com.asiainfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author 24
 * @date 2021/6/18
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/helloWord")
    @ResponseBody
    public String getHello() {
        return "hello";
    }
}
