package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//允许接受前端请求
public class HelloController {
    @GetMapping("/")
//    public  String hello(@RequestParam(name = "name") String name, Model model) {
//        model.addAttribute("name",name);
    public  String index() {
        return "index";

    }
}
