package com.task.task.controller;

import com.task.task.entity.Person;
import com.task.task.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
@CrossOrigin(origins = "http://localhost:3000")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        return personService.savePerson(person);
    }

    @GetMapping
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id) {
        personService.deletePerson(id);
    }
}