package com.task.task.repository;

import com.task.task.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person, Long> {
}
