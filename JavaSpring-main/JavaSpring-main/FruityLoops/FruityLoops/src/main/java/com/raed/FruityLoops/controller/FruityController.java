package com.raed.FruityLoops.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sellini.FruityLoops.models.FruityModel;

import ch.qos.logback.core.model.Model;

@Controller
public class FruityController { 
	@RequestMapping("/")
public String index(Model model) {
    
    ArrayList<FruityModel> fruits = new ArrayList<FruityModel>();
    fruits.add(new FruityModel("Kiwi", 1.5));
    fruits.add(new FruityModel("Mango", 2.0));
    fruits.add(new FruityModel("Goji Berries", 4.0));
    fruits.add(new FruityModel("Guava", .75));
    
    model.addAttribute("fruits", fruits);
    
    return "index.jsp";
}

}
