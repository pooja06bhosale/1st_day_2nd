package com.example.pooja_spring_first_project;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHello {

    @RequestMapping("/hello")
    public String SayHello(){
        return "Hello";
        
    }
    // here name is variable so we put into curly braces--hello is constant

    @RequestMapping("/hello/{name}")
    // pathvariable used for-- from  map taking  name variable and map with String name
    public String SayHellotosomeone(@PathVariable("name") String name){
        return "Hello"+ " "+name;


    }
}
