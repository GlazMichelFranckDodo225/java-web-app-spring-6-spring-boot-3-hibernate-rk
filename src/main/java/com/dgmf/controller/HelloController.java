package com.dgmf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    // http://localhost:8080/hello
    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello, what are you learning today ?";
    }

    // http://localhost:8080/hello-html
    @RequestMapping("/hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<!DOCTYPE html>");
        sb.append("<html lang=\"en\">");
        sb.append("<head>");
        sb.append("<meta charset=\"UTF-8\">");
        sb.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        sb.append("<title>My First HTML Page</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My First HTML Page with Body.");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }
}
