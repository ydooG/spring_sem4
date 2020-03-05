package ru.itis.rkhasanov.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class DefaultController {

    @GetMapping("/main")
    public String main(ModelMap modelMap) {
        modelMap.put("name", "Rasim");
        return "main";
    }
}
