package com.example.learn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ProductController {
  
  @RequestMapping("/product")
  public String getProducts() {
    return "product";
  }

}