package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZYC on 2018/3/16.
 */
@RestController
public class Demo1Controller {

    @GetMapping("/helloWorld")
    public String helloWorld(){
        return "helloWorld!!";
    }
}
