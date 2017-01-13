package com.spring.rest.security.service;

import java.util.List;

import com.spring.rest.security.model.Person;

public interface PersonService {
	public void addPerson(Person person);
	public List<Person> getPersons();
	public void updatePerson();
	public void deletePerson();
}
