package com.example.chatbot.controller;

import com.example.chatbot.model.MessageRequest;
import com.example.chatbot.model.MessageResponse;
import com.example.chatbot.service.ChatbotService;
import org.springframework.web.bind.annotation.*;
// here I handles incoming API requests
@RestController
public class WebhookController {

    private final ChatbotService chatbotService;
// this is constructor injection for service class
    public WebhookController(ChatbotService chatbotService) {
        this.chatbotService = chatbotService;
    }
// API endpoint for  receive the chatbot messages
    @PostMapping("/webhook")
    public MessageResponse webhook(@RequestBody MessageRequest request) {
        return chatbotService.reply(request);
    }
}