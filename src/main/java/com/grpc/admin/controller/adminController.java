package com.grpc.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class adminController {

    @GetMapping("/signin")
    public String adminSignin(){
        return "sigin";
    }

    @GetMapping("/verify")
    public String userVerification(){
        return "User verified";
    }

    @GetMapping("/inventory")
    public String inventoryDetails(){
        return "Scooter Inventory";
    }

}
