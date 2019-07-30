package com.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("user/greet")
    public String greet(@RequestParam String name ){
        return "Hello " + name;
    }
}
