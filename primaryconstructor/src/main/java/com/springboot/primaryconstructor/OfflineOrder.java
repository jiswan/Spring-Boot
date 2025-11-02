package com.springboot.primaryconstructor;

import org.springframework.stereotype.Component;

@Component
public class OfflineOrder implements Order{
    public OfflineOrder()
    {
        System.out.println("Offline order initialized");
    }
}
