package com.example.chatbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// this is the class to start Spring Boot application
@SpringBootApplication
public class ChatbotApplication {
    public static void main(String[] args) {

        // Here I  launch an application server
        SpringApplication.run(ChatbotApplication.class, args);
    }
}