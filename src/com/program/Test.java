package com.program;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(10,"Ram","Pune"));
		al.add(new Employee(15,"Sonali","Nagpur"));
		al.add(new Employee(20,"Gaurav","Mumbai"));
		Collections.sort(al);
		for(Employee emp:al) {
			System.out.println(emp);
		}
	}
}
