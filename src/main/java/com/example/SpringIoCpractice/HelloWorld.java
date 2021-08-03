package com.example.SpringIoCpractice;

public class HelloWorld {
  private String hello;

  public void setHello(String hello) {
    this.hello = hello;
  }

  public void getHello() {
    System.out.println(hello);
  }

  public void init(){
    System.out.println("Bean-init.");
  }
  public void destroy(){
    System.out.println("Bean-destroy");
  }
}