package com.setterdependency.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
    public Order order;
    public User()
    {
        System.out.println("user initialized");
    }
    @Autowired
    public void setterDependency(Order order)
    {
        this.order=order;
    }
}
