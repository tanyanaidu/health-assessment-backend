package com.example.demo.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoForceConfig {

    @Bean
    public MongoClient mongoClient() {
        return MongoClients.create(
            "mongodb+srv://admin:admin123@cluster0.qwnh5gm.mongodb.net/healthdb?retryWrites=true&w=majority"
        );
    }
}