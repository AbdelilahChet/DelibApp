/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gdelib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author abdel-ilah
 */
@Controller
public class MyController {
    
    @RequestMapping("/index")
    public String Index(@RequestParam(value="name", required=false, defaultValue="World") String name,Model model) {
        model.addAttribute("name", "Kahina");
        return "index";
    }
    
}
