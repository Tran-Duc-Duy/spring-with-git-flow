package com.example.springwithgitflow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("Home")
    //@ResponseBody này để hỗ trợ return trực tiếp ra HTML (output là text index), nếu  không có thì sẽ đi tìm file nào có tên index để chạy
    public String index() {
        return "index";
    }
}
