package org.training.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.training.service.MyService;

@Controller
public class MyController {
    @Autowired
    private MyService service;

    @GetMapping("/hello")
    public String showHello(Model model){
        Long ordersCount = service.countOrders();
        model.addAttribute("ordersCount",ordersCount);
        return "index";
    }
}