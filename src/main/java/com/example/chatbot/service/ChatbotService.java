package com.example.chatbot.service;

import com.example.chatbot.model.MessageRequest;
import com.example.chatbot.model.MessageResponse;
import org.springframework.stereotype.Service;
// This is the main chatbot logic of the whatsapp
@Service
public class ChatbotService {

    public MessageResponse reply(MessageRequest request) {
        System.out.println("Incoming message from: " + request.getFrom());
        System.out.println("Message: " + request.getMessage());

        String msg = request.getMessage().trim().toLowerCase();
        String response;

        if (msg.equals("hi")) {
            response = "Hello";
        } else if (msg.equals("bye")) {
            response = "Goodbye";
        } else {
            response = "Sorry, I don't understand that.";
        }

        return new MessageResponse(request.getFrom(), response);
    }
}
