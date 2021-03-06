package com.stream.parllel;

import java.util.stream.IntStream;

public class ParallelStream {
	
	
	
	public static void main(String[] args) {
		
		
		long start =0;
		long end = 0;
		
		start= System.currentTimeMillis();
		IntStream.range(0,100).forEach(System.out::println);;
		end=System.currentTimeMillis();
		System.out.println("Time " +(end-start));
		
		System.out.println("*************************************************");
		
		start= System.currentTimeMillis();
		IntStream.range(0,100).parallel().forEach(System.out::println);;
		end=System.currentTimeMillis();
		System.out.println("Time " +(end-start));
		
		
		IntStream.range(1, 10).forEach(x ->
		System.out.println("Thread"  + Thread.currentThread().getName()+"|" +x));
		
		
		
	}
	
	

}
