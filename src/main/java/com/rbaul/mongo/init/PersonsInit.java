package com.rbaul.mongo.init;


import com.rbaul.mongo.model.Person;
import com.rbaul.mongo.services.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Component
public class PersonsInit implements ApplicationRunner {

    private final PersonService personService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Person> allPersonsRegular = personService.getAllPersonsRegular();
        if (allPersonsRegular.isEmpty()) {
            List<Person> persons = new ArrayList<>();

            for (int i = 0; i < 100; i++) {
                persons.add(Person.builder()
                        .name(MessageFormat.format("name {0}", i))
                        .familyName(MessageFormat.format("familyName {0}", i))
                        .age((float) i).build());
            }
            personService.create(persons);
        }
    }
}
