/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dnt.controllers;

import com.dnt.services.CategoryService;
import com.dnt.services.ProductService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author admin
 */
@Controller
@ControllerAdvice  //Moi controller co the dung @ModelAttribute
public class IndexController {
    @Autowired
    private CategoryService cateService;
    @Autowired
    private ProductService prodService;
    @ModelAttribute //Chay truoc RequestMapping
    public void commonAttribute(Model model){
        model.addAttribute("categories", this.cateService.getCates());
    }
    
    @RequestMapping("/")
    public String index(Model model,
            @RequestParam Map<String, String> params) {
        model.addAttribute("products", this.prodService.getProducts(params));
        return "index"; //ten cua definition trong file tiles.xml
    }
}
