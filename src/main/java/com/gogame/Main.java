package com.gogame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class Main {

    @RequestMapping("/")
    public String getInitialPage() {
        return "index.html";
    }

    public static void main(String ... args) {
        SpringApplication.run(Main.class, args);
    }
}
