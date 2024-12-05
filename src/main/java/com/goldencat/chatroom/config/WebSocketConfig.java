package com.goldencat.chatroom.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

// marks it as a configuration file for spring
@Configuration
// websocket message handling using message broker
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    // responsibel for sending messages
    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        config.enableSimpleBroker("/topic");
        config.setApplicationDestinationPrefixes("/app");
    }

    // this will be used by the clients to establish connection
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // withSockJS emulates websocket connection
        registry.addEndpoint("/chat-websocket").withSockJS();
    }
}