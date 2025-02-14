package com.dtmiranda.dreamshop.exceptions;

public class ProductNotFoundException extends RuntimeException{
  public ProductNotFoundException(String message) {
    super(message);
  }
}
