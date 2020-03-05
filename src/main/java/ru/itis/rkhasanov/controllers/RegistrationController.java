package ru.itis.rkhasanov.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ru.itis.rkhasanov.models.SiteUser;

import javax.validation.Valid;

@Controller
public class RegistrationController {
    @GetMapping("/reg")
    public String registrationForm(ModelMap modelMap) {
        modelMap.put("user", new SiteUser());
        return "registration_form";
    }

    @PostMapping("/reg")
    public String registerUser(
            RedirectAttributes redirectAttributes,
            @Valid @ModelAttribute("user") SiteUser user,
            BindingResult result,
            ModelMap map
    ) {
        if (result.hasErrors()) {
            redirectAttributes.addFlashAttribute("message", "<span style=\"color:red\">You fucked up :( </span>");
            return "book_form";
        } else {
            redirectAttributes.addFlashAttribute("message", "<span style=\"color:green\">User \"" + user.getName() + "\" registered successfully!</span>");
            return "redirect:" + MvcUriComponentsBuilder.fromMappingName("RC#registrationForm").build();
        }
    }
}
