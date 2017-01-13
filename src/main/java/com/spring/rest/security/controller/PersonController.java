package com.spring.rest.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.security.model.Person;
import com.spring.rest.security.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;

	@RequestMapping(value="/person", method=RequestMethod.POST)
	public void addPerson(@RequestBody Person person) {
		personService.addPerson(person);
	}

	@RequestMapping(value="persons", method=RequestMethod.GET)
	public List<Person> getPerson() {
		return personService.getPersons();
	}



}
