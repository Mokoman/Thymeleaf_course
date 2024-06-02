package com.example.learn.domain;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class User {
  private Integer id;
  @NotEmpty
  @Size(min = 3, max = 50)
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
  //private Date dateOfRegistration;

  public User() { }

  public User(Integer id, String firstName, String lastName, String email, String password) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
    //this.dateOfRegistration = new Date(System.currentTimeMillis());
  }

  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
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

  /*
  public Date getDateOfRegistration() { return dateOfRegistration; }
  public void setDateOfRegistration(Date dateOfRegistration) { this.dateOfRegistration = dateOfRegistration; }
  */

  

}
