package com.example.learn.commands;

import jakarta.validation.constraints.NotEmpty;

public class LoginCommand {
  @NotEmpty
  private String userName;
  @NotEmpty
  private String password;

  public LoginCommand() { }  

  public LoginCommand(@NotEmpty String userName, @NotEmpty String password) {
    this.userName = userName;
    this.password = password;
  }

  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

}
