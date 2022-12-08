package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest")
public class Controller {

    @GetMapping
    public String hello(){
        return "Assalomu alaykum";
    }

    @PostMapping("/post")
    public String save(@RequestBody final String add){
        return add;
    }

    @PutMapping("/put")
    public String update(@RequestBody final String update){
        return update;
    }


}
