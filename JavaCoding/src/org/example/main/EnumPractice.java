package org.example.main;

import java.util.Scanner;

public class EnumPractice {
	
	enum ArithmeticOpt{
		EXIT,SUM,SUB,MULTIPLICATION,DIVISION;  // enum declare inside bracket
	}

	private static Scanner sc = new Scanner(System.in);
	private static int sum(int num1, int num2) {
		return num1 + num2;
	}
	private static int sub(int num1, int num2) {
		return num1 - num2;
	}
	private static int mult(int num1, int num2) {
		return num1 * num2;
	}
	private static int divide(int num1, int num2) {
		return num1 / num2;
	}
	
	private static ArithmeticOpt menulist() {
		int choice = sc.nextInt();
		System.out.println("0.Exist.");
		System.out.println("1.Sum.");
		System.out.println("2.Sub.");
		System.out.println("3.Multiplication.");
		System.out.println("4.Division.");
		System.out.println("5.Enter choice.");
		ArithmeticOpt[] arr = ArithmeticOpt.values(); 
		return arr[choice];
		
	}
	
	public static void main(String[] args) {
		ArithmeticOpt choice;
		while ((choice = EnumPractice.menulist()) != ArithmeticOpt.EXIT) {
			int result = 0;
			switch (choice) {
			case SUM:                //1   thses are constant 1, 2, 3, 4 we can not uderstant the code  if it is written in this way but if we use enum as sum bum then read ability will increase
				result = EnumPractice.sum(100, 20);
				break;
			case SUB:               //2
				result = EnumPractice.sub(100, 20);
				break;
			case MULTIPLICATION:      //3
				result = EnumPractice.mult(100, 20);
				break;
			case DIVISION:        //4
				result = EnumPractice.divide(100, 20);
				break;
			}
			System.out.println("Result : " + result);
			
		}
	}
	
	

}
