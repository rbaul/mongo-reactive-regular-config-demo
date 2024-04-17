package com.rbaul.mongo.repository;

import com.rbaul.mongo.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRegularRepository extends MongoRepository<Person, String> {
}
