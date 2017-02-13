package com.spring.rest.security.service;

import java.util.List;

import com.spring.rest.security.model.Person;

public interface PersonService {
	public Person addPerson(Person person);
	public List<Person> getPersons();
	public void deletePerson(String id);
	public void deletePerson(Person person);
	public Person updatePerson(Person person);
	public List<Person> addPerson(List<Person> person);
}
