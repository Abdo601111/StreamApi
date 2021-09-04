package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamDemo {
	
	
	public static void main(String[] args) {
		
		List<String> l = Arrays.asList("mohamed","amira","abdo","abdallah","assmas");
		List<Integer> l1 = Arrays.asList(1,2,3,4,5);
		Optional<String>text=l.stream().reduce((p,p1) -> p.concat(p1));

		System.out.println(text);
		
		String text1 =l.stream().reduce("concsat : ",(p,p1) -> p.concat(p1));
		System.out.println(text1);
		
		Optional<Integer> g=l1.stream().reduce((i,d) -> i+d);
		System.out.println(g.get());
	}
	

}
