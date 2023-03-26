package id.goota.generic.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${message}")
    private String message;

    @GetMapping("/info")
    public String info(){
        return message;
    }

}