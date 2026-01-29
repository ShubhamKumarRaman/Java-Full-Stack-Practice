// Defining class using getter setter method
package com.example.P01ClassObject;

public class J02Student {

	String name;
	int age;
	String city;
	
	public J02Student(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	public String getName () {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public String getCity() {
		return city;
	}
	
	@Override
	public String toString() {
		return "Name is : "+name+
				"\nAge is : "+age+
				"\nCity is : "+city;
	}
	
	public static void main(String[] args) {
		J02Student s1 = new J02Student("Shubham", 22, "Patna");
		System.out.println(s1);
	}

}
