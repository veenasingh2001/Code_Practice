package org.example.main;


import java.util.Scanner;

class Student{
	private String name;
	private int rollNumber;
	private float marks;
	public void acceptrecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("name : " );
		this.name = sc.nextLine();
		System.out.println("Roll numbere : " );
		this.rollNumber = sc.nextInt();
		System.out.println("marks : " );
		this.marks = sc.nextFloat();
		
	}
	public void printRecord() {
		System.out.println("Name : "+ this.name);
		System.out.println("rollNumber : "+ this.rollNumber);
		System.out.println("marks : "+ this.marks);
						
	}		
}

public class Day_6 {	
	public static void main(String[] args) {
		Student student;
		//student = null;  initialized by null 1st way ( it will give null pointer exception , avoid this process)
//		Student s2 = new Student();
//		Student s1 = s2;   refrence to already creaded object 2nd way
//		s1.printRecord();
		//Student student = new Student();  cteate a new object and initalised it 3rd way
		
		 student = new Student();
		 
		
    	student.acceptrecord();
//		student.printRecord();
		
	}
public static void main1(String[] args) {
		
		Student student = new Student();
		student.acceptrecord();
		student.printRecord();
		
	}

}
