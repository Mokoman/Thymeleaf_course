package com.example.learn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.learn.domain.User;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class RegistrationController {
  
  @GetMapping("/registration")
  public String showForm() { //Model model) {
    //User user = new User();
    //model.addAttribute("user", user);
    return "register";
  }
  
  //@PostMapping("/registration")
  //public String submitForm(@ModelAttribute("user") User user, BindingResult bindingResult) {
  @RequestMapping(value = "/doRegister", method=RequestMethod.POST)
  public String submitForm(@Valid User user, BindingResult bindingResult) {
    
    System.out.println(bindingResult);

    if (bindingResult.hasErrors()) { return "register"; }
    else {
      System.out.println("Registration successful:");
      System.out.println("First name posted: " + user.getFirstName());
      System.out.println("Last name posted: " + user.getLastName());
      System.out.println("Password posted: " + user.getPassword());
      System.out.println("Email posted: " + user.getEmail());
      //System.out.println("Created: " + user.getDateOfRegistration());
      System.out.println("id: " + user.getId());

      return "register_success";
    }
}

}
