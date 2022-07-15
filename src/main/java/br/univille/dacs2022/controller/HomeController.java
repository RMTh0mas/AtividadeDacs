package br.univille.dacs2022.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/home")
public class HomeController {
    
    @GetMapping
    public ModelAndView index(){
        String msg = "Seja bem-vindo!";
        return new ModelAndView("home/index", "msgnatela", msg);
    }
}
