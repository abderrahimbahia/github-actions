package com.bahia.githubactionsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsDemoApplication {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Github actions!";
    }

    public static void main(String[] args) {
        SpringApplication.run(GithubActionsDemoApplication.class, args);
    }

}
