package com.javatechie.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class OpenAIChatService {

    private final ChatClient chatClient;

    public OpenAIChatService(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }


    public String chatWithOpenAILLM(String message) {
        return chatClient
                .prompt(message)
                .call()
                .content();
    }
}
