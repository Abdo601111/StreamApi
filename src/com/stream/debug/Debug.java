package com.stream.debug;

import java.util.List;
import java.util.stream.Collectors;

import com.stream.PersonRepository;

public class Debug {

	public static void main(String[] args) {
		
		
	List<String> names =PersonRepository.listPersone().stream()
		.filter(person -> person.getSalary() > 60000)
		.map(p -> p.getName())
		.distinct()
		.sorted()
		.collect(Collectors.toList());
		
	System.out.println(names);

	}

}
