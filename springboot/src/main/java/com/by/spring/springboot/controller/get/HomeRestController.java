package com.by.spring.springboot.controller.get;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homePlain() {
        return "<h1>Welcome Spring Boot!!</h1>";
    }
}
