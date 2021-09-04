package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapAndReduce {
	
	
	public static void main(String[] args) {
		
		
		List<Integer> numbers = Arrays.asList(5,45,6,28,3,9,44);
		List<String> words= Arrays.asList("mohamed","amira","abdo","abdallah","assmaa");
		
		
		//Count
		long s= numbers.stream().mapToInt(i ->i).count();
		System.out.println(s);
		
		//Sum
		
		int c = numbers.stream().mapToInt(i ->i).sum();
		System.out.println(c);
		
		//Sum
		int sum= numbers.stream().reduce(0, (a,b) -> a+b);
		System.out.println(sum);
		
		//*
		int cc= numbers.stream().reduce(1, (a,b) -> a*b);
		System.out.println(cc);
		
		//Max Value
        int maxValue=numbers.stream().reduce(0, (a,b) -> a>b ?a:b);
        System.out.println(maxValue);
        
        //Max
        int maxValuee=numbers.stream().reduce(Integer :: max).get();
        System.out.println(maxValuee);
        
        //Max Value of String
        String word= words.stream().reduce((word1,word2) -> word1.length()>word2.length() ?word1:word2).get();
        System.out.println(word);
        
        //Filter Salary average and Gender
        
      double salaryAverage= PersonRepository.listPersone().stream().filter(emp -> emp.getGender().equals(Gender.MALE))
    		 .map(i->i.getSalary())
    		 .mapToDouble(o->o)
    		 .average().getAsDouble();
		System.out.println(salaryAverage);
		
		 //Filter Salary Max and Gender
		double salaryMax= PersonRepository.listPersone().stream().filter(emp -> emp.getGender().equals(Gender.MALE))
	    		 .map(i->i.getSalary())
	    		 .mapToDouble(o->o).max()
	    		 .getAsDouble();
			System.out.println(salaryMax);
			
			 //Filter Salary Max and Gender
			double salaryMin= PersonRepository.listPersone().stream().filter(emp -> emp.getGender().equals(Gender.MALE))
		    		 .map(i->i.getSalary())
		    		 .mapToDouble(o->o).min()
		    		 .getAsDouble();
				System.out.println(salaryMin);
	}

}
