package com.dgmf.controller;

import com.dgmf.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class LoginController {
    private final AuthenticationService authenticationService;

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
            @RequestParam String userName,
            @RequestParam String password,
            ModelMap modelMap
    ) {
        if(authenticationService.authenticate(userName, password)) {
            modelMap.put("firstName", firstName);
            modelMap.put("lastName", lastName);
            modelMap.put("userName", userName);

            return "home_page";
        }

        modelMap.put("errorMessage", "Invalid Credentials. Please Try Again.");

        return "login";
    }
}
