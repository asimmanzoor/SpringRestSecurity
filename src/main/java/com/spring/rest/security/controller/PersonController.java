package com.spring.rest.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
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

	@RequestMapping(value="/person/addPerson", method=RequestMethod.POST)
	public Person addPerson(@RequestBody Person person) {
		return personService.addPerson(person);

	}

	@RequestMapping(value="person/user/getPerson", method=RequestMethod.GET)
	public List<Person> getPerson() {
		return personService.getPersons();
	}

	@RequestMapping(value="person/getPersonAdmin", method=RequestMethod.GET)
	@PreAuthorize("hasRole('ADMIN')")
	public List<Person> getPersonAdmin() {
		return personService.getPersons();
	}
	@RequestMapping(value="person/user/getPersonUser", method=RequestMethod.GET)
	@PreAuthorize("hasRole('USER')")
	public List<Person> getPersonUser() {
		return personService.getPersons();
	}

	@RequestMapping(value="person/updatePerson", method=RequestMethod.PUT)
	@PreAuthorize("hasRole('ADMIN')")
	public Person updatePerson(@RequestBody Person person) {
		return personService.updatePerson(person);
	}

	@RequestMapping(value="person/deletePerson/{id}", method=RequestMethod.DELETE)
	@PreAuthorize("hasRole('ADMIN')")
	public String deletePersonById(@PathVariable String id) {
		personService.deletePerson(id);
		return "Person has been deleted !";
	}

	@RequestMapping(value="person/deletePerson", method=RequestMethod.DELETE)
	@PreAuthorize("hasRole('ADMIN')")
	public String deletePersonById(@RequestBody Person person) {
		personService.deletePerson(person);
		return "Person has been deleted !";
	}


}
