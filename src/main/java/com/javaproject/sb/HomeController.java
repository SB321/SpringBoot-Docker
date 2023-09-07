package com.javaproject.sb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class HomeController {

    @RequestMapping("/")
    public String firstHandler(){

        return "Sample Java Web Application";
    }

    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "Spring") String name) {
        return String.format("Hello,  %s!", name);
    }
}
