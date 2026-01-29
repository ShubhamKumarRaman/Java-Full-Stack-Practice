// Using Reflection 
package com.example.P01ClassObject;

class Student{
	public Student() {}
}

public class J03Student {

	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("com.example.P01ClassObject.Student");
			Student s = (Student) c.getDeclaredConstructor().newInstance();
			System.out.println(s);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
