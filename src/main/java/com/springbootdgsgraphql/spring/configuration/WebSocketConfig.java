//package com.springbootdgsgraphql.spring.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.reactive.handler.SimpleUrlHandlerMapping;
//import org.springframework.web.reactive.socket.WebSocketHandler;
//import org.springframework.web.reactive.socket.server.support.WebSocketHandlerAdapter;
//
//import java.util.Map;
//
//@Configuration
//public class WebSocketConfig {
//
//    @Bean
//    public SimpleUrlHandlerMapping handlerMapping(WebSocketHandler webSocketHandler) {
//        return new SimpleUrlHandlerMapping(Map.of("/subscriptions", webSocketHandler), -1);
//    }
//
//    @Bean
//    public WebSocketHandlerAdapter handlerAdapter() {
//        return new WebSocketHandlerAdapter();
//    }
//}