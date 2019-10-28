package com.gaohang.controller;

import com.gaohang.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class Thymeleaf {
    @GetMapping("/toLogin")
    public String toLogin()throws Exception{
        return "login";
    }

    @PostMapping("/login")
    public ModelAndView login(User user)throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.addObject("user",user);
        mv.setViewName("success");
        return mv;
    }

    @RequestMapping("/thymeleaf")
    public String helloThymeleaf()throws Exception{
        return "helloThymeleaf";
    }

}
