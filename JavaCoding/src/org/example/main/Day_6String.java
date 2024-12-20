package org.example.main;

  ///////////////getter (read ) setter(modify )

class MyStudent{
	private String name;
	private int rollNumber;
	private float marks;
	
	
	public String getName() {
		
		return this.name;
	}
	public int getRollNumber() {
		// TODO Auto-generated method stub
		return this.rollNumber;
	}
	public float getMarks() {
		
		return this.marks ;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
		
	}
	public void setMarks(float marks) {
		this.marks = marks;
		
	}
	
}

public class Day_6String {
	
	
	public static void main(String[] args) {		
//		String s1 = new String("veena");   // string constant
//		String s2 = "veena"; // string literals
		MyStudent student = new MyStudent();
		
		student.setName( "veena");
		student.setRollNumber(1) ;
		student.setMarks(90) ;
		
		
//		String name = student.getName();
//		int rollNumber = student.getRollNumber();
//		float marks = student.getMarks();
		
		System.out.println("name "+ student.getName());
		System.out.println("RollNumber "+ student.getRollNumber());
		System.out.println("marks "+ student.getMarks());
		
			
		
		
		
	} 

}
