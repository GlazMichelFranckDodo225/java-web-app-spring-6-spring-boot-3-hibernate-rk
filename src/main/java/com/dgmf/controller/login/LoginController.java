package com.dgmf.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {

        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String homePage(
            @RequestParam String firstName,
            @RequestParam String lastName,
            ModelMap modelMap
    ) {
        modelMap.put("firstName", firstName);
        modelMap.put("lastName", lastName);

        return "home_page";
    }
}
