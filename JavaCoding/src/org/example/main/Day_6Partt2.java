package org.example.main;
import java.util.Scanner;

//////////////////constructor/////////////////////

class Test{	
	private int real;
	private int imag;
	
	public Test(){ ///////////////constructor is used to initalised the instance variable and initialisatin happens only single time not multiple time 
		System.out.println("calling 1st const ");
		this.real=1;
		this.imag = 2;	
		
	}	
	
	{
		// instance initializer block
		System.out.println("instance initialer bok");
		this.real= 20; // in this way by creating a single line of reapeating code in a block we can reduce repetation of code in every const
	    this.imag=70;
	}
	public Test(int i, int j) {
		System.out.println("calling 2st const ");
		
	}
//	private Test(int i){  /// private constructor
//	this(i, i); /////////////// constructor chaining
//		System.out.println("private const ");
//		this.real= real;
//		this.imag=imag;
//	}	
	public Test(int i){  /// private constructor
		System.out.println("single arug ");
		
	}	
	
	
	
	public static void constPrivateTest() {  // this method is creating instance of private constructor in same method so that we can use it another class by calling this method)
		System.out.println("private const method");
		Test t = new Test(20);	
	}
	
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Real Number : " );
		this.real = sc.nextInt();
		System.out.println("Enter imag Number : " );
		this.imag = sc.nextInt();
	}
	public void printRecord() {
		System.out.println( "real "  + this.real);
		System.out.println( "imag "  + this.imag);
				
	}
}

public class Day_6Partt2 {
	
	public static void main(String[] args) {
		Test test = new Test(); ///calling constructor user defined default contru ctor
	//	test.acceptRecord();
		test.printRecord();
		
		Test test2 = new Test(12, 23); //// paramaterised constructor
//		test2.acceptRecord();
		test2.printRecord();
//		
		Test.constPrivateTest(); // can not create private const instance in diff class so calling the method of that class in which the insctance of constructor is created)
		System.out.println("*********end *******************");
		
		Test test3 = new Test(90);
		//test3.acceptRecord();
		test3.printRecord();
	}
}