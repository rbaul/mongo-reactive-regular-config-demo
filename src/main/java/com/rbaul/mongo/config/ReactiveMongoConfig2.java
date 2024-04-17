package com.rbaul.mongo.config;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.ReactiveMongoDatabaseFactory;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.SimpleReactiveMongoDatabaseFactory;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;

//@Configuration
public class ReactiveMongoConfig2 {

    @Value("${spring.data.mongodb.uri}")
    private String uri;


    public MongoClient reactiveMongoClient() {
        return MongoClients.create(uri);
    }

    protected String getDatabaseName() {
        return "mongo-demo";
    }

    @Bean
    public ReactiveMongoTemplate reactiveMongoTemplate(ReactiveMongoDatabaseFactory databaseFactory, MappingMongoConverter mongoConverter) {
        return new ReactiveMongoTemplate(databaseFactory, mongoConverter);
    }

    @Bean
    public ReactiveMongoDatabaseFactory reactiveMongoDbFactory() {
        return new SimpleReactiveMongoDatabaseFactory(this.reactiveMongoClient(), this.getDatabaseName());
    }
}
