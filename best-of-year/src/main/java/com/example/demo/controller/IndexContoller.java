package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.ProvaNome;

@Controller
public class IndexContoller {

    @GetMapping("/name")
    public String home(Model model) {
//    	ProvaNome mario = new ProvaNome();
//    	mario.setName("mario");
//    	
//    	model.addAttribute("name" , "seni");
    	return "home";

    	
    }
}
