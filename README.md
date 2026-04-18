Spring AI Chatbot (Ollama Integration)
Project Overview

This project is a Spring Boot-based chatbot backend that integrates with a locally running large language model using Ollama and Spring AI. It provides REST APIs to send user input to the model and receive generated responses.

The application follows a clean layered architecture and is designed to be easily extendable for advanced AI use cases.

How It Works

Client → REST API → ChatController → ChatService → Ollama → Response

The client sends a message through an HTTP request
The controller receives the request
The service forwards the input to the AI model via Ollama
The model processes the input
The generated response is returned to the client
Features
REST API for chatbot interaction
Integration with local LLM using Ollama
Structured request and response using DTOs
Clean architecture (Controller → Service → DTO)
Local execution (no external API dependency)
Easily extendable for advanced features
Project Structure

src/main/java/

controller/

ChatController.java – Handles API requests

service/

ChatService.java – Contains business logic and AI interaction

dto/

ChatRequest.java – Request model
ChatResponse.java – Response model
SpringAiChatbotApplication.java – Main application class
Tech Stack
Java
Spring Boot
Spring AI
Ollama
Maven
Prerequisites
Java 17 or higher
Maven
Ollama installed and running locally
Install and Run Ollama

Download Ollama from:
https://ollama.com

Run a model (example):

ollama run llama2

Make sure Ollama is running before starting the application.

Run the Application
mvn spring-boot:run

Application will start on:

http://localhost:8080
API Usage
Endpoint

POST /chat

Request Body
{
  "message": "Hello, how are you?"
}
Response
{
  "response": "I'm doing well. How can I assist you?"
}
Use Cases
Backend for chatbot applications
Local AI assistant
Testing and experimenting with LLMs
Integration layer for AI-powered systems
Future Enhancements
Conversation memory
Document-based question answering
Database integration
Authentication and security
Frontend integration
Learning Outcomes
Integrating Spring AI with a local LLM
Building REST APIs for AI interaction
Understanding chatbot backend architecture
Designing scalable AI-enabled applications
Conclusion

This project demonstrates how to build a lightweight and scalable chatbot backend using Spring Boot and Ollama, enabling local AI processing without relying on external services.
