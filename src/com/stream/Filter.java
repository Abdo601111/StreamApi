package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Person> person = PersonRepository.listPersone();
		
		//Filter Of Integer
		Stream<Integer> s1 = l1.stream();
		s1.filter(n -> n%2 == 0).collect(Collectors.toList()).forEach(n-> System.out.println(n));
		
		
		
		//Filter Of Person
		
		List<Person> p= person.stream().filter(n->n.getGender().equals(Gender.MALE)).collect(Collectors.toList());
	        
		p.forEach( System.out::println);

	}

}
