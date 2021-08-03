package com.example.SpringIoCpractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("hello.xml");
        HelloWorld bean = (HelloWorld) context.getBean("helloWorld");

        bean.getHello();
    }
}