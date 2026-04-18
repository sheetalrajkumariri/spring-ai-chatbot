# Spring AI Chatbot (Ollama Integration)

## Project Overview

This project is a Spring Boot-based chatbot backend that integrates with a locally running Large Language Model (LLM) using Ollama and Spring AI. It provides REST APIs to send user input to the model and receive intelligent responses.

The application demonstrates how to build a backend service that connects to a local AI model instead of using external APIs.

---

## What is Ollama?

Ollama is a tool that allows you to run Large Language Models (LLMs) locally on your system.

Instead of calling cloud-based AI APIs, Ollama runs models directly on your machine, providing:

- Faster responses  
- Better privacy  
- No API cost  

---

## What is a Large Language Model (LLM)?

A Large Language Model (LLM) is an AI model trained on large datasets to understand and generate human-like text.

It can:
- Answer questions  
- Explain concepts  
- Generate text  
- Assist in coding  

In this project, the chatbot sends user input to an LLM through Ollama and returns the generated response.

---

## How It Works

```
Client → REST API → ChatController → ChatService → Ollama → Response
```

### Flow Explanation

1. User sends a message via API  
2. ChatController receives the request  
3. ChatService processes the message  
4. Spring AI sends the prompt to Ollama  
5. Ollama generates a response  
6. Response is returned to the client  

---

## Features

- REST API for chatbot interaction  
- Integration with local LLM using Ollama  
- Structured request and response using DTOs  
- Clean layered architecture  
- No external API dependency  
- Fast and private local execution  

---

## Project Structure

```
src/main/java/

├── controller/
│   └── ChatController.java

├── service/
│   └── ChatService.java

├── dto/
│   ├── ChatRequest.java
│   └── ChatResponse.java

└── SpringAiChatbotApplication.java
```

---

## Tech Stack

- Java  
- Spring Boot  
- Spring AI  
- Ollama  
- Maven  

---

## Prerequisites

- Java 17 or higher  
- Maven  
- Ollama installed  

---

## Install and Run Ollama

### Step 1: Download

Download from:  
https://ollama.com

---

### Step 2: Run a Model

```
ollama run llama2
```

This will download and start the model locally.

---

### Step 3: Verify Installation

```
ollama --version
```

---

## Run the Application

```
mvn spring-boot:run
```

Application runs at:

```
http://localhost:8080
```

---

## API Usage

### Endpoint

POST /chat

---

### Request

```json
{
  "message": "Hello"
}
```

---

### Response

```json
{
  "response": "Hello! How can I help you?"
}
```

---

## Use Cases

- Backend for chatbot applications  
- Local AI assistant  
- LLM experimentation  
- AI-powered backend systems  

---

## Future Enhancements

- Conversation memory  
- Context awareness  
- Document-based Q&A  
- Database integration  
- Authentication and security  

---

## Conclusion

This project demonstrates how to build a chatbot backend using Spring Boot and integrate it with a local LLM using Ollama. It provides a scalable and cost-effective approach for building AI-powered applications without relying on external APIs.

---
