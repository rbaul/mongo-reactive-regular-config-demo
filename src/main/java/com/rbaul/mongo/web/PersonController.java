package com.rbaul.mongo.web;

import com.rbaul.mongo.model.Person;
import com.rbaul.mongo.services.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/persons")
public class PersonController {

    private final PersonService personService;

    @GetMapping
    public List<Person> getAllPersonsRegular() {
        return personService.getAllPersonsRegular();
    }

    @GetMapping("/reactive")
    public Flux<Person> getAllPersonsReactive() {
        return personService.getAllPersonsReactive();
    }
}
