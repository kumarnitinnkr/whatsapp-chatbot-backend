# WhatsApp Chatbot Backend Simulation

A backend chatbot project developed using **Java + Spring Boot** that simulates WhatsApp style incoming webhook messages and automated replies.

---

## Features

- REST API using Spring Boot
- POST `/webhook` endpoint
- JSON request and response handling
- Predefined chatbot replies
- Clean Controller-Service-Model architecture
- Maven build system
- Ready for cloud deployment

---

## Tech Stack

- Java 17
- Spring Boot
- Maven
- REST API
- JSON

---

## Project Structure  

whatsapp-chatbot-backend/
├── src/main/java/com/example/chatbot/
│ ├── controller/
│ ├── service/
│ ├── model/
│ └── ChatbotApplication.java
├── src/main/resources/
│ └── application.properties
└── pom.xml

---

## Run Locally

```bash
mvn spring-boot:run

## Screenshots

### 1. API Response Test

![API Test Screenshot]([images/api_test.png](https://github.com/kumarnitinnkr/whatsapp-chatbot-backend/blob/main/images/api_test.png))

### 2. Project Folder Structure

![Project Structure Screenshot](images/project_structure.png](https://github.com/kumarnitinnkr/whatsapp-chatbot-backend/blob/main/images/project_structure.png)
