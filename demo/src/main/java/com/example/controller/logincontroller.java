package com.example.controller;

import com.example.result.result;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import com.example.demo.User;

import java.util.Objects;

@Controller
public class logincontroller {

    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public result login(@RequestBody User requestUser) {
        // 对 html 标签进行转义，防止 XSS 攻击
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);

        if (!Objects.equals("admin", username) || !Objects.equals("123456", requestUser.getPassword())) {
            String message = "账号密码错误";
            System.out.println("test");
            return new result(400);
        } else {
            return new result(200);
        }
    }
}
