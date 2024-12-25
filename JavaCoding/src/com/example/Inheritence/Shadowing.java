package com.example.Inheritence;

class A{
	public int x = 10;
	
}
class B extends A{
	public int x = 20;
	
	public void print() {
		System.out.println(" A.x = " + super.x);
	}
}
public class Shadowing {
 public static void main(String[] args) {
	A a = new A();
	System.out.println(" A :  "+ a.x);
	
	B b = new B(); 
	
	System.out.println(" B :  "+ b.x);  // shadowing same variable name but local variable get the prefrence.
	
	//for printing the Super class Variable use Super keyword
	b.print(); // It willI Print the Value of x of class super
} 
}
