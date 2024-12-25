package com.example.Inheritence;

class student extends Emply{
	private int roll;
	private int clas;
	
	public void display() {
		super.display();  // it call the method of super class
		System.out.println("roll : "+ this.roll); // sub class student only print roll and class 
		System.out.println("clas : "+ this.clas);
		
	}
}


public class Super {
	
	public static void main(String[] args) {
		student st = new student();
		st.display();    
		} 
	private static int x = 10;
	public static void main1(String[] args) {
		int x = 20;  // locl variable will print 1st as local variable shadow the fields. 
		System.out.println(x);
		
	}

}
