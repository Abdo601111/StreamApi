package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Person {
	
	
	private String name;
	private int heigth;
	private  double salary;
	 private final Gender gender;
	private int kids;
	List<String> hoppins = new ArrayList<>();
	String address;
	




	public Person(String name, int heigth, double salary, Gender gender, int kids, List<String> hoppins,
			String address) {
		super();
		this.name = name;
		this.heigth = heigth;
		this.salary = salary;
		this.gender = gender;
		this.kids = kids;
		this.hoppins = hoppins;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeigth() {
		return heigth;
	}
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Gender getGender() {
		return gender;
	}
	
	public int getKids() {
		return kids;
	}
	public void setKids(int kids) {
		this.kids = kids;
	}
	public List<String> getHoppins() {
		return hoppins;
	}
	public void setHoppins(List<String> hoppins) {
		this.hoppins = hoppins;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}




	@Override
	public String toString() {
		return "Person [name=" + name + ", heigth=" + heigth + ", salary=" + salary + ", gender=" + gender + ", kids="
				+ kids + ", hoppins=" + hoppins + ", address=" + address + "]";
	}
	
	
	
	

}
