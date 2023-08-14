package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/")
    public String index() {
        String s = "Hello Citi Team from AWS App Runner. The JDK version is " + System.getProperty("java.version");
        return s;
    }
    
    @GetMapping("/s3")
    public String GetObject(){
    	return "Hello S3";
    }
    
    @GetMapping("/ddb")
    public String GetItem(){
    	return "Hello Dynamo";
    }

}

