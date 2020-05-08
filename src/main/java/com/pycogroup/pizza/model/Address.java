package com.pycogroup.pizza.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Address {

  private String streetAddress;
  private String city;
  private String country;
  
  public Address(String streetAddress, String city, String country) {
    
    this.streetAddress = streetAddress;
    this.city = city;
    this.country = country;
  }
}
