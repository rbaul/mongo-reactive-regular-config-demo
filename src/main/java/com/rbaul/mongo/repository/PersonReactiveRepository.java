package com.rbaul.mongo.repository;

import com.rbaul.mongo.model.Person;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PersonReactiveRepository extends ReactiveMongoRepository<Person, String> {
}
