package com.example.testTomcat.dao;

import com.example.testTomcat.model.Person;
import java.util.List;

import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id, Person person);
    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        System.out.println("interface post!");
        return insertPerson(id, person);
    }
    List<Person> selectAllPeople();
    String selectPerson();
    Optional<Person> selectPersonById(UUID id);
    int deletPersonById(UUID id);
    int updatePersonById(UUID id, Person person);
}
