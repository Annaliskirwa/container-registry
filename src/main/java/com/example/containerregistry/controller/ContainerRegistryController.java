package com.example.containerregistry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class ContainerRegistryController {

    @GetMapping(value = "containerRegistry")
    public String containerRegistry(){
        return "I am testing container registry";
    }
}
