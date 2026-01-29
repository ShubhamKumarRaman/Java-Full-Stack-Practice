package com.example.P01ClassObject;

public class J01Student {
	
	int id;
	String name;
	String city;
	
	public void study() {
		System.out.println(this.name+" is Studing.....");
	}
	
	public void showFullDetails() {
		System.out.println("Id: "+this.id);
		System.out.println("Name: "+this.name);
		System.out.println("City: "+this.city);
	}
	

	public static void main(String[] args) {
		J01Student std1 = new J01Student();
		std1.id = 101;
		std1.name = "Shubham Kumar";
		std1.city = "Patna";
		std1.study();
		std1.showFullDetails();
		
		J01Student s2 = new J01Student();
		s2.id= 102;
		s2.name = "Rahul Kumar";
		s2.city = "Barh";
		s2.study();
		s2.showFullDetails();
	}

}
