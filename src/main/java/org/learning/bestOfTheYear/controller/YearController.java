package org.learning.bestOfTheYear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.naming.Name;

@Controller
@RequestMapping("/")
public class YearController {
    @GetMapping
    public String year (Model model){
        model.addAttribute("name", "Matteo");
        model.addAttribute("year", 2023);

        return "index";
    }
}


