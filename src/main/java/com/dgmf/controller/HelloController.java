package com.dgmf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    // http://localhost:8080/say-hello
    @RequestMapping("/say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello, what are you learning today ?";
    }

    // http://localhost:8080/say-hello-html
    @RequestMapping("/say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>My First HTML Page - Changed !</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My First HTML Page with Body - Changed !");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }

    // Remember to Add Rights Properties and Dependencies to the
    // "application.properties" and "pom.xml" Files
    // http://localhost:8080//myjsp
    @RequestMapping("/say-hello-jsp")
    // @ResponseBody
    public String sayHelloJsp() {
        // return "Hello, what are you learning today ? - JSP";
        return "sayHello";
    }
}
