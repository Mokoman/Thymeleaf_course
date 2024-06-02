package com.example.learn.commands;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class CheckoutCommand {
  @NotEmpty
  @Size(min = 3, max = 50)
  //@Pattern(regexp = "\\^(?!\\s*$).+")
  private String firstName;
  @NotEmpty
  @Size(min = 3, max = 50)
  private String lastName;
  @NotEmpty
  @Size(min = 3, max = 50)
  private String email;
  @NotEmpty
  @Size(min = 3, max = 50)
  private String password;

  public CheckoutCommand() {
  }

  
  public CheckoutCommand(@NotEmpty @Size(min = 3, max = 50) String firstName,
      @NotEmpty @Size(min = 3, max = 50) String lastName,
      @NotEmpty @Size(min = 3, max = 50) String email,
      @NotEmpty @Size(min = 3, max = 50) String password) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
  }



  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  

}
