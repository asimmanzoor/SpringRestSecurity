package com.spring.rest.security.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.rest.security.model.Person;
import java.lang.String;
import java.util.List;

public interface PersonRepository extends MongoRepository<Person, String> {

	List<Person> findByName(String name);
	List<Person> findByCity(String city);
	List<Person> findById(String id);

}
