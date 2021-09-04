package com.stream;



public class Sorted {
	
	
	public static void main(String[] args) {
		
	boolean n=PersonRepository.listPersone()
			.stream()
			.allMatch(p -> p.getHeigth() < 150);
	System.out.println(n);
	
		
		
	}

}
