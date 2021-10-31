package com.practice.jpa_topics.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerGreeting {

    @RequestMapping("/hello")
    public String printGreeting() {
        return "Hi Max";
    }
}
