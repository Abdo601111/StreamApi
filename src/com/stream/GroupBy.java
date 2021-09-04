package com.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {
	
	public static void main(String[] args) {
		
		
		List<Person> person = PersonRepository.listPersone();
		
		// Group
	    Map<Gender, List<Person>> groupByGender = person.stream()
	        .collect(Collectors.groupingBy(Person::getGender));
	
	    groupByGender.forEach((gender, people1) -> {
	      System.out.println(gender);
	      people1.forEach(System.out::println);
	      System.out.println();
	    });

	}

}
