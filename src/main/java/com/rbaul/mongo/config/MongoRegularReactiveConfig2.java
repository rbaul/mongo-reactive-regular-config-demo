package com.rbaul.mongo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.autoconfigure.mongo.PropertiesMongoConnectionDetails;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoRegularReactiveConfig2 {

    @Value("${spring.data.mongodb.uri}")
    private String uri;

    @Bean
    public PropertiesMongoConnectionDetails mongoConnectionDetails() {
        MongoProperties mongoProperties = new MongoProperties();
        mongoProperties.setUri(uri);
        return new PropertiesMongoConnectionDetails(mongoProperties);
    }

}
