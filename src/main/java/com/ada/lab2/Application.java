package com.ada.lab2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalTime;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Controller
    @RequestMapping("/")
    class Welcome{
        @GetMapping
        public String welcome(Model model){
            LocalTime currentTime = LocalTime.now();
            int hour = currentTime.getHour();
            String greetingMessage = (hour < 12) ? "Good Morning" : "Good Afternoon!";

            model.addAttribute("message", greetingMessage);
            model.addAttribute("name", "Ada Zhang");
            return "welcome";
        }
    }
}
