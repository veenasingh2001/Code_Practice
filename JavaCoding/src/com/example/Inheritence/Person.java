package com.example.Inheritence;

import java.net.CacheRequest;

class Human{
	private int id = 2;
	public String name;
	public int age;
	public static String st = "dhooommmmm";
 	public Human() {
		
	}

	public Human(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
     public Human(String name, int age,int id) {
		
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public void displayRecord() {
		System.out.println("name : " + getName());
		System.out.println("age : " + getAge());
		System.out.println("id " + getid());
		
		
	}
	
	class Test{
		public int testNum = 100;
		
	}
	
	
}
class Emply extends Human{
	public int empid;
	public float salary;
	
	public Emply() {
		
	}
	public Emply(int empid, float salary,int age, String name) {
		//super(name,age);
		this.empid = empid;
		this.salary = salary;
	}
	public Emply(int empid, float salary) {
		
		this.empid = empid;
		this.salary = salary;
	}
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void display() {
		System.out.println("empid : " + getEmpid());
		System.out.println("salary " + getSalary());
		
		 
		
		
	}
	public void display2() {
		System.out.println("empid : " + this.empid);
		System.out.println("salary " + this.salary);		
	} 
	
}
public class Person {
	public static void main(String[] args) {
		Human human = new Human();
		Human human1 = new Human("veena",25);// sub class constructor will called 
		
		Emply emply = new Emply(); // both sub and super class constructor will called
		//Emply emply2 = new Emply(1,300000.07f);
		
		
	}
	public static void main2(String[] args) {
		// nested class method and foeld are aslo inherit to sub class;
		Human.Test test = new Human().new Test();
		System.out.println("Nested TestClass  : " + test.testNum);
		
		Emply.Test test2 = new Emply().new Test();
		System.out.println("Nested TestClass  from sub class ref : " + test2.testNum);
	}
	public static void main1(String[] args) {
		Human human = new Human();
		Emply emply = new Emply();
		//human.age=23;
		//human.name="veena";  
		//human.empid// incorrect as parent or super class has no assess of  childor sub class fields
		emply.age=22;
		emply.name = "veena";
		emply.empid = 29;
		emply.salary= 34000.0f;
		/// emply means child class hass acess of all the field of parent class
		//human.displayRecord();
		emply.display();
		emply.displayRecord();  // methods also inherit of super/parent to sub/child class
		System.out.println("dhoom : " + Human.st); // static field of parent class can be assecd from child class
		System.out.println("dhoom : " + Emply.st);
		emply.getid(); // id is private in super class but we can acess it by creating getter setter method and private field are not visible directly 
	}

}