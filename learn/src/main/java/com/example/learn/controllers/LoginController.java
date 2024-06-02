package com.example.learn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.learn.services.LoginService;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {
  
  private LoginService loginService;

  @RequestMapping("/login")
  public String getLogin(Model model) {
      return "login";
  }  

}
