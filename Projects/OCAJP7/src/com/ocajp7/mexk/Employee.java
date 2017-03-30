package com.ocajp7.mexk;

public class Employee {

	public String name;
	private int age;
	
	
	public static void main(String[] args) {
		int number = 10;
		
		Employee employee = new Employee();
		employee.setAge(11);
		changeValues(number, employee);
		System.out.println(number);
		System.out.println(employee.getAge());
		
	}
	
	private static void changeValues(int num,
			Employee employee) {
			num = 20;
			employee.setAge(22);
			employee = new Employee();
			employee.setAge(33);
			}

	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

}
