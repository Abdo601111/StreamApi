package com.stream;

import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {
	
	public static void main(String[] args) {
		List<Person> person = PersonRepository.listPersone();
		
	 List<String> p =person.stream().map(ps -> ps.getName()).collect(Collectors.toList());
		
		System.out.println(p);
		
		List<Integer> pp =person.stream().map(pss -> pss.getHeigth()).collect(Collectors.toList());
			
			System.out.println(pp);
			
			 List<String> c=	person.stream()
		.flatMap(s -> s.getHoppins().stream())
		.collect(Collectors.toList());
			 System.out.println(c);
			
	
			
		

		
		
		
	}

}
