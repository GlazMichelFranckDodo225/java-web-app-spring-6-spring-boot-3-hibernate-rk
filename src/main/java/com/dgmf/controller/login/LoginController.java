package com.dgmf.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    // http://localhost:8080/login
    // http://localhost:8080/login?name=Glaz
    @RequestMapping("/login")
    public String login(@RequestParam String name, ModelMap modelMap) {
        // System.out.println("Request Param is : " + name);
        modelMap.put("name", name);

        return "login";
    }
}
