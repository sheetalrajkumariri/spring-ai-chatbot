package com.chatbot.controller;

import com.chatbot.dto.ChatRequest;
import com.chatbot.dto.ChatResponse;
import com.chatbot.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ChatController {

    @Autowired
    private ChatService chatService;

    @PostMapping("/ask")
    public ChatResponse ask(@RequestBody ChatRequest request){

        String answer = chatService.chat(request.getQuestions());
        return new ChatResponse(answer);
    }


}
