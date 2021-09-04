package com.stream;

import java.util.List;

public class Count {
	
	public static void main(String[] args) {
		
List<Person> person = PersonRepository.listPersone();
		
		double count=person.stream().mapToDouble(i -> i.getSalary()).count();
		System.out.println(count);
		
	}

}
