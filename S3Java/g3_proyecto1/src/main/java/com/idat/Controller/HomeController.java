package com.idat.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/Seguridad")
public class HomeController {
    @GetMapping("login")
    public String login (Model model){
        return "Seguridad/login";
    }
}
