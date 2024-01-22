package com.dgmf.controller.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    // http://localhost:8080/login
    // http://localhost:8080/login?name=Glaz
    @RequestMapping("/login")
    public String login(@RequestParam String name, ModelMap modelMap) {
        modelMap.put("name", name);

        // Logging Statements
        logger.debug("Request Param is : {}", name);
        logger.info("Request Param is : {}", name);
        logger.warn("Request Param is : {}", name);

        // Not Recommended for Prod Code
        System.out.println("Request Param is : " + name);

        return "login";
    }
}
