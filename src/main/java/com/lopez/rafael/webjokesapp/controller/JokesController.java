package com.lopez.rafael.webjokesapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.lopez.rafael.webjokesapp.service.JokesService;

@Controller
public class JokesController {

    JokesService jokesService;

    @Autowired
    public JokesController(JokesService jokesService)
    {
        this.jokesService = jokesService;
    }

    @RequestMapping(path = {"/", ""})
    public String handleRequest(Model model) {
        model.addAttribute("joke", jokesService.getRandomQuote());
        return "chucknorris";
    }
}
