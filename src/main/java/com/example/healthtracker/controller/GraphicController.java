package com.example.healthtracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class GraphicController {

    @GetMapping("/displayBarGraph")
    public String barGraph(Model model) {
        Map<String, Integer> stressMap=new HashMap<>();
        stressMap.put("Stress", 40);
        model.addAttribute("stressMap", stressMap);
        return "barGraph";
    }
}
