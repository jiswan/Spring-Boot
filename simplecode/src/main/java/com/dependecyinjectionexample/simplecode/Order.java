package com.dependecyinjectionexample.simplecode;

import org.springframework.stereotype.Component;

@Component         //order class
public class Order {
    public Order()
    {
        System.out.println("order Initialized");
    }
}
