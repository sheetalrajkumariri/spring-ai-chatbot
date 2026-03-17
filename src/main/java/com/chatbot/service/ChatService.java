package com.chatbot.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ChatService {

    private final ChatClient chatClient;

    public ChatService(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    public String chat(String questions) {
        log.info("Sending question to Ollama: {}", questions);
     String response = chatClient.
             prompt(questions)
             .call().content();
        log.info("Received response from Ollama: {}", response);
     return response;
    }
}
