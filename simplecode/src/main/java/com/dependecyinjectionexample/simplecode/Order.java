package com.dependecyinjectionexample.simplecode;

import org.springframework.stereotype.Component;

@Component
public class Order {
    public Order()
    {
        System.out.println("order Initialized");
    }
}
