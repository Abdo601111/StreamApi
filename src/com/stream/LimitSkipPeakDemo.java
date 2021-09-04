package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitSkipPeakDemo {

	public static void main(String[] args) {
		
		
		List<String> l = Arrays.asList("mohamed","amira","abdo","abdallah","assmas");
        List<Integer> l1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		
        //l.stream().limit(3).collect(Collectors.toList()).forEach(n ->System.out.println(n.toUpperCase()));
        l.stream().skip(1).collect(Collectors.toList()).forEach(n ->System.out.println(n.toUpperCase()));
	}
	
	
}
