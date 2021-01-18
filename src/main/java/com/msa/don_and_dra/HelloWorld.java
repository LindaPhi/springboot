package com.msa.don_and_dra;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorld {

    @GetMapping(value = "/")
    public String index(){
        return "Hello world";
    }
}

