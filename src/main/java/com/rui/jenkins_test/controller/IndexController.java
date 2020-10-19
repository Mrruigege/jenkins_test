package com.rui.jenkins_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xiaorui
 */
@Controller
public class IndexController {

    @GetMapping("/index")
    @ResponseBody
    public String index() {
        return "Hello jenkins";
    }
}
