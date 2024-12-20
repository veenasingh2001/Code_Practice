package org.example.main;


class Test1{
	private int num=10;  // instance field initializer
	private int num2;
	private int num3;
	
	
	{
		this.num2 = 20;   // block initalizer
	}
	
	public Test1() {
		this.num3 = 30;  // const initializer
	}
	public void printRecord() {
		System.out.println("Number : "+ this.num);
		System.out.println("Number2 : "+ this.num2);
		System.out.println("Number3 : "+ this.num3);
		
	}
}
public class Block_Field_Const {
   public static void main(String[] args) {
	   Test1 test = new Test1();
	   test.printRecord();
	
   }
 }
