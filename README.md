# Spring AI Chatbot — Ollama Integration

A proof-of-concept demonstrating how to build a chatbot backend using Spring Boot and integrate it with a locally running large language model using Ollama and Spring AI.

---

## What is this Project?

This project is a backend service that allows users to interact with an AI model through REST APIs.

Instead of calling external APIs, it connects to a locally running model using Ollama.

Example flow:

User: "Explain Java streams"
  ↓
API receives request
  ↓
Service sends prompt to Ollama
  ↓
Ollama generates response
  ↓
Response returned to user

---

## Architecture

┌──────────────────────────────┐
│        Client (User)         │
│  (Postman / Frontend App)    │
└──────────────┬───────────────┘
               │ HTTP Request
               ▼
┌──────────────────────────────┐
│     Spring Boot Backend      │
│                              │
│   ChatController (/chat)     │
│              ↓               │
│       ChatService            │
│              ↓               │
│      Spring AI Layer         │
│              ↓               │
│        Ollama (LLM)          │
└──────────────────────────────┘

---

## Project Structure

src/main/java/

├── controller/
│   └── ChatController.java         Handles API requests
│
├── service/
│   └── ChatService.java            Business logic and AI interaction
│
├── dto/
│   ├── ChatRequest.java            Request payload
│   └── ChatResponse.java           Response payload
│
└── SpringAiChatbotApplication.java Main entry point

---

## How the Chat Flow Works

1. User sends a message using REST API  
2. ChatController receives the request  
3. ChatService processes the message  
4. Spring AI sends the prompt to Ollama  
5. Ollama generates a response  
6. Response is returned to the client  

---

## Features

- REST-based chatbot API  
- Integration with local LLM via Ollama  
- Clean layered architecture  
- No external API dependency  
- Fast local inference  
- Easily extendable for advanced AI features  

---

## Tech Stack

Technology        Role
-----------       -------------------------
Spring Boot       Backend framework
Spring AI         AI integration layer
Ollama            Local LLM runtime
Java              Programming language
Maven             Build tool

---

## Getting Started

### Prerequisites

- Java 17 or higher  
- Maven  
- Ollama installed  

---

### Install Ollama

Download from:
https://ollama.com

Run a model:

```bash
ollama run llama2
```

---

### Start the Application

```bash
mvn spring-boot:run
```

Server starts at:

http://localhost:8080

---

## API Usage

### Endpoint

POST /chat

---

### Request Example

```json
{
  "message": "Explain microservices architecture"
}
```

---

### Response Example

```json
{
  "response": "Microservices architecture is a design approach..."
}
```

---

## Use Cases

- Chatbot backend for applications  
- Local AI assistant  
- Testing and experimenting with LLMs  
- AI-enabled backend services  

---

## Future Enhancements

- Conversation memory  
- Context awareness  
- Document ingestion (RAG)  
- Database integration  
- Authentication and security  

---

## Conclusion

This project demonstrates how to build a chatbot backend using Spring Boot and integrate it with a local LLM using Ollama. It provides a simple and scalable foundation for building AI-powered applications.

---

## Author

Sheetal Singh
