package com.rbaul.mongo.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.bson.UuidRepresentation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class ReactiveMongoConfig3 extends AbstractReactiveMongoConfiguration {

    @Value("${spring.data.mongodb.uri}")
    private String uri;

    @Override
    protected String getDatabaseName() {
        return "mongo-demo";
    }

//    @Override
//    public MongoClient reactiveMongoClient() {
//        return MongoClients.create(uri);
//    }

    @Override
    protected void configureClientSettings(MongoClientSettings.Builder builder) {
        builder.applyConnectionString(new ConnectionString(uri));
    }
}
