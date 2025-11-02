package com.springboot.primaryconstructor;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class OnlineOrder implements Order {
    public OnlineOrder()
    {
        System.out.println("Online order Initiated");
    }
}
