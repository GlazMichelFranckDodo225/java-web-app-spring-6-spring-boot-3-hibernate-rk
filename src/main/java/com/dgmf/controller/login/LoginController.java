package com.dgmf.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    // http://localhost:8080/login
    // http://localhost:8080/login?name=Glaz
//    @RequestMapping("/login")
//    public String login(@RequestParam String name, ModelMap modelMap) {
//        modelMap.put("name", name);
//
//        return "login";
//    }
    @RequestMapping("/login")
    public String login() {

        return "login";
    }
}
