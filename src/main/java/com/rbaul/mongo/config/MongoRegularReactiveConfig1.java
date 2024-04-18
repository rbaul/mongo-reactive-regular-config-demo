package com.rbaul.mongo.config;

import com.mongodb.ConnectionString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.mongo.MongoClientSettingsBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoRegularReactiveConfig1 {

    @Value("${spring.data.mongodb.uri}")
    private String uri;

    @Bean
    public MongoClientSettingsBuilderCustomizer mongoClientSettingsBuilderCustomizer() {
        return builder -> builder.applyConnectionString(new ConnectionString(uri));
    }
}
