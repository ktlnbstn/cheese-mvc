package com.example.cheesemvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cheese")
public class CheeseController {

    // request path: /cheese
    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("title", "My Cheeses");
        return "cheese/index";
    }

}
