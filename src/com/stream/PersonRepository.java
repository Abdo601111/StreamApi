package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonRepository {
	
	
	public static List<Person> listPersone(){
		
		return Stream.of(
				new Person("abdo", 170, 9000, Gender.MALE, 3, Arrays.asList("foodpoll","swmming"),"Fayoum"),
				new Person("mohamed", 170, 20000, Gender.MALE, 3, Arrays.asList("foodpoll","swmming"),"Fayoum"),
				new Person("amira", 170, 15000, Gender.FEMALE, 3, Arrays.asList("foodpoll","swmming"),"Fayoum"),
				new Person("Abbdall", 100, 10000, Gender.MALE, 3, Arrays.asList("foodpoll","swmming"),"Fayoum"),
				new Person("assma", 70, 9000, Gender.FEMALE, 3, Arrays.asList("foodpoll","swmming"),"Fayoum")
				).collect(Collectors.toList());
				
				
				
		
	}

	
}
