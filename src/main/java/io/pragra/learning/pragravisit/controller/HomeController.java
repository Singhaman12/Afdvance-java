package io.pragra.learning.pragravisit.controller;

import io.pragra.learning.pragravisit.entity.PragraVisitor;
import io.pragra.learning.pragravisit.service.VisitorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
//
@Controller
  public class HomeController {
//
    private VisitorService service;

    public HomeController(VisitorService service) {
        this.service = service;
    }
//
    @GetMapping("/")
    public String home(Model model){
        String heading = "Pragra FullSTack Java CLass";
        model.addAttribute("msg", heading);
        return "index";
    }
//
    @GetMapping("/visits")
    public String visitor(Model model){
        List<PragraVisitor> visitors = service.getAll();
        model.addAttribute("visitors", visitors);
        return "visitor";
    }

    @GetMapping("/person")
    public String home1(Model model){
        String heading = "Hello From Aman";
        model.addAttribute("msg", heading);
        return "index";
    }

}