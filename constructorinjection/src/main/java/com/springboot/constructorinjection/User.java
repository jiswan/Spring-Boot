package com.springboot.constructorinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
    public Order order;
    @Autowired
    public User(Order order)
    {
       this.order = order;
       System.out.println("User Initialized");
    }
}
