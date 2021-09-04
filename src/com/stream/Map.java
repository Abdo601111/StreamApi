package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map{
	

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Person> person = PersonRepository.listPersone();
		// Map Of Integer
		Stream<Integer> s1 = l1.stream();
		s1.map(n -> n*n).collect(Collectors.toList()).forEach(n -> System.out.println(n));
		
		// map Of String
		person.stream().map(n->n).collect(Collectors.toList()).forEach(n -> System.out.println(n));
		
		
	}

}
