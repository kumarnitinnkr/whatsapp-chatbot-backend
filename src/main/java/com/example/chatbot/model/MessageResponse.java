package com.example.chatbot.model;


// this is model for chatbot response


public class MessageResponse {
    private String to;
    private String reply;

    public MessageResponse() {}

    public MessageResponse(String to, String reply) {
        this.to = to;
        this.reply = reply;
    }

    public String getTo() { return to; }
    public void setTo(String to) { this.to = to; }

    public String getReply() { return reply; }
    public void setReply(String reply) { this.reply = reply; }
}
