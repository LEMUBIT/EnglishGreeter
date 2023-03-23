package com.example.englishgreeter;

import com.example.greeterapi.Greeter;

public class EnglishGreeter implements Greeter {
    public String greet(String name) {
        return "Hello " + name;
    }
}



