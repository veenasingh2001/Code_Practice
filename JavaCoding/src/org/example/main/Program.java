package org.example.main;

public class Program {
	public static void sum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("result : "+ result);
		
	}
	public static void sum(int num1, int num2, int num3) {
		int result = num1 + num2+ num3;
		System.out.println("result : "+ result);
	}
	public static void main(String[] args) {
		Program.sum(10, 20);
		Program.sum(10, 20,30);
	}
}
