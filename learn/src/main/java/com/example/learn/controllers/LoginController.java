package com.example.learn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.example.learn.commands.LoginCommand;
import com.example.learn.services.LoginService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {
  
  //private LoginService loginService;

  @RequestMapping("/login")
  public String showLoginForm(Model model) {
    model.addAttribute("loginCommand", new LoginCommand());
    return "loginform";
  }

  @RequestMapping(value = "/dologin", method=RequestMethod.POST)
  public String doLogin(@Valid LoginCommand loginCommand, BindingResult bindingResult) {

    if(bindingResult.hasErrors()) {
      return "loginform";
    }

    return "redirect:/index";

  }

}
