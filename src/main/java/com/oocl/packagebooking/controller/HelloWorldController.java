package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.Repository.CargoPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @Autowired
    private CargoPackageRepository cargoPackageRepository;

    @GetMapping
    public String getHelloWorld() {
        return "Hello world";
    }







}
