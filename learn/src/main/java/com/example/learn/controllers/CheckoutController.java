package com.example.learn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.learn.commands.CheckoutCommand;

import jakarta.validation.Valid;


@Controller
public class CheckoutController {

  @RequestMapping("checkout")
  public String checkoutForm(Model model) {

    model.addAttribute("checkoutCommand", new CheckoutCommand());

      return "checkoutform";
  }

  @RequestMapping(value = "/docheckout", method=RequestMethod.POST)
  public String doCheckout(@Valid CheckoutCommand checkoutCommand, BindingResult bindingResult) {

    /*
    System.out.println(checkoutCommand.getFirstName());
    System.out.println(checkoutCommand.getLastName());
    System.out.println(checkoutCommand.getEmail());
    System.out.println(checkoutCommand.getPassword());
    */

    if (bindingResult.hasErrors()) {
      return "checkoutform";
    }
    
    return "checkoucomplete";

  }
  
}
