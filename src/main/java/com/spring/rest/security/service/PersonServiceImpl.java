package com.spring.rest.security.service;

import java.util.List;

import org.apache.regexp.recompile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.security.model.Person;
import com.spring.rest.security.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;


	@Override
	public Person addPerson(Person person) {
		return personRepository.save(person);

	}

	@Override
	public List<Person> getPersons() {
		return personRepository.findAll();
	}

	@Override
	public Person updatePerson(Person person) {
		return personRepository.save(person);

	}

	@Override
	public void deletePerson(String id) {
		personRepository.delete(id);

	}

	@Override
	public void deletePerson(Person person) {
		personRepository.delete(person);
	}


}
