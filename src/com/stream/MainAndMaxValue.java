package com.stream;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class MainAndMaxValue {

	public static void main(String[] args) {
List<Person> person = PersonRepository.listPersone();
		

      // Min
		OptionalDouble min=person.stream().mapToDouble(i -> i.getSalary()).min();
		System.out.println(min.getAsDouble());
		
		// Max
		OptionalDouble max=person.stream().mapToDouble(i -> i.getSalary()).max();
		System.out.println(max.getAsDouble());
		
		// Max value Of String
		
		Optional<String> word= person.stream().map(p->p.getName())
				.reduce((word1,word2) -> word1.length()>word2.length()? word1:word2 );
		
		System.out.println(word.get());
		
		// Min value Of String
		
				Optional<String> wordMin= person.stream().map(p->p.getName())
						.reduce((word1,word2) -> word1.length()<word2.length()? word1:word2 );
				
				System.out.println(wordMin.get());
		
		
		

	}

}
