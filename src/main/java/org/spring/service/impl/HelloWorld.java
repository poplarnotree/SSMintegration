package org.spring.service.impl;

import org.springframework.stereotype.Service;

@Service("hw")
public class HelloWorld {
    public void show(){
        System.out.println("hello world");
    }
}
