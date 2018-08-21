package com.shannoncantech.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/petform")
    public String loadFormPage(Model model){
        model.addAttribute("pet", new Pet());
        return "petform";
    }

    @PostMapping("/petform")
    public String loadFromPage(@ModelAttribute Pet pet, Model model){
        model.addAttribute("pet", pet);
        return "petinfo";
    }
}
