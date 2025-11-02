package com.springboot.constructorinjection;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Order {
    public Order()
    {
        System.out.println("order initialized");
    }

}
