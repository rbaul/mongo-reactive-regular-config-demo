package com.rbaul.mongo.services;

import com.rbaul.mongo.model.Person;
import com.rbaul.mongo.repository.PersonReactiveRepository;
import com.rbaul.mongo.repository.PersonRegularRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class PersonService {

    private final PersonRegularRepository regularRepository;

    private final PersonReactiveRepository reactiveRepository;

    public List<Person> getAllPersonsRegular() {
        return regularRepository.findAll();
    }

    public Flux<Person> getAllPersonsReactive() {
        return reactiveRepository.findAll();
    }

    public void create(List<Person> persons) {
        regularRepository.saveAll(persons);
    }
}
