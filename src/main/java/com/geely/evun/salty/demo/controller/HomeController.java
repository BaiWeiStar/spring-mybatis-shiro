package com.geely.evun.salty.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hangjie.lou on 2017/8/15.
 */
@Controller
public class HomeController {
    @RequestMapping(value = {"/","/index"},method = RequestMethod.GET)
    public String index(){
        return "/home";
    }

}
