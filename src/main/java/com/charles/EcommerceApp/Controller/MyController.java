package com.charles.EcommerceApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {



    @GetMapping("/")
    public String home() {
        return "<HTML><H1>Welcome to Java FullStack Application</H1></HTML>";
    }
}
