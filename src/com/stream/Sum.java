package com.stream;

import java.util.List;

public class Sum {

	
	public static void main(String[] args) {
		List<Person> person = PersonRepository.listPersone();
		
		double sum=person.stream().mapToDouble(i -> i.getSalary()).sum();
		System.out.println(sum);
	}
	
}
