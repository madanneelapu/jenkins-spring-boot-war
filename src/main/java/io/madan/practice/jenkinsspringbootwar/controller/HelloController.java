package io.madan.practice.jenkinsspringbootwar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello/{userName}")
    public String greet(@PathVariable String userName){
        return "Good Day! " + userName;
    }

}
