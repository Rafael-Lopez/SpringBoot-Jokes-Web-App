package com.lopez.rafael.webjokesapp.controllers;

import com.lopez.rafael.webjokesapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    JokeService jokeService;

    @Autowired
    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping(path = {"/", ""})
    public String showJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }
}
