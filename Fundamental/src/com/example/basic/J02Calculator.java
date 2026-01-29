package com.example.basic;
import java.util.Scanner;

public class J02Calculator {

	public static int add(int x, int y) {
		return x+y;
	}
	
	public static int sub(int x, int y) {
		return x-y;
	}
	
	public static int mul(int x, int y) {
		return x*y;
	}
	
	public static int div(int x, int y) {
		if(y==0) {
			System.out.println("Cannot divisible by zero");
			return null;
		}
		return x/y;
	}
	
	public static int mod(int x, int y) {
		if(y==0) {
			System.out.println("Cannot divisible by zero");
		}
		return x%y;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the operator (+,-,/,*,%):" );
		char op = sc.nextLine().charAt(0);
		
		System.out.print("Enter First number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter Second number: ");
		int num2 = sc.nextInt();
		
		int result=0;
		
		switch(op) {
		case '+':
			result = add(num1, num2);
			break;
		case '-':
			result = sub(num1, num2);
			break;
		case '*':
			result = mul(num1, num2);
			break;
		case '/':
			result = div(num1, num2);
			break;
		case '%':
			result = mod(num1, num2);
			break;
		}
		System.out.println("Result: "+result);
		
	}

}
	