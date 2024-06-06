package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class pruebaTestService {
    public int sumar (int a, int b){
        System.out.println("holaasaa");
        return a+b;
    }
}
