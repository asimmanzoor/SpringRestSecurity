package com.spring.rest.security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rest.security.model.Person;
import com.spring.rest.security.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;


	@Override
	public void addPerson(Person person) {
		personRepository.save(person);

	}

	@Override
	public List<Person> getPersons() {
		return personRepository.findAll();
	}

	@Override
	public void updatePerson() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePerson() {
		// TODO Auto-generated method stub

	}


}
