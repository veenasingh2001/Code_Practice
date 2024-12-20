package org.example.main;

class person{
	public void print() {
		System.out.println("inside print");
	}
}
public class AnonymousInnerClass {
	
	public static void main(String[] args) {
		person person = new person();
		person person2 = new person(){  // anonymosus class . its .class will be program$1.class
			private int emId = 1267;
			private int salay= 2300000;
			
			@Override
			public void print() {
				System.out.println("emp id :"+ this.emId);
				System.out.println("salary : "+ this.salay);
			}
		};
		person2.print();
	}
 public static void main1(String[] args) {
	person person = null;
	new person(); // annonymous instance
	person person2 = new person();// instance with ref
	
}
}
