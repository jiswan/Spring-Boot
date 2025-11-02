package com.setterdependency.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Order {

    public Order()
    {
        System.out.println("order initialized");
    }
}
