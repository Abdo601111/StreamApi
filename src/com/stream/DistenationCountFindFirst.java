package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DistenationCountFindFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = Arrays.asList("mohamed","amira","abdo","abdallah","abdo");
		List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,1,2,3,10);
		
		l1.stream().distinct().forEach(n -> System.out.println(n));
		l.stream().distinct().forEach(n -> System.out.println(n));
		
	long n=	l1.stream().count();
	Optional<Integer> f=l1.stream().findFirst();
	Optional<String> c=	l.stream().findFirst();
	
	
			System.out.println(n);
			System.out.println(f.get());
			System.out.println(c.get());
		
		
		
		
			
	}
}
	
	
	
	
	