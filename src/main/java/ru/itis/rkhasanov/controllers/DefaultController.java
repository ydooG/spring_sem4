package ru.itis.rkhasanov.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/main")
public class DefaultController {

    @RequestMapping(method = RequestMethod.GET)
    public String main() {
        return "main";
    }
}
