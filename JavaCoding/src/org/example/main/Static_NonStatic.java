package org.example.main;


class Test3{
	private int num1; // non static field(instance variable)
	private int num2; // non static field(instance variable)
	private  static int num3;  // static field(class level variable)
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
		
	}

	public  static void setNum3(int num3) {   // for static field static method and we are not using this here using class name as inside static no this referce .;
		Test3.num3 = num3;
		
	}
	public void printRecord() {
		System.out.println("Num1 : "+ num1);
		System.out.println("Num2 : "+ num2);
		System.out.println("Num3 : "+ num3);
		
	}
	
}
public class Static_NonStatic {
 public static void main(String[] args) {
	Test3 t = new Test3();
	t.setNum1(10);
	t.setNum2(20);
	Test3.setNum3(30);
	t.printRecord();
	
}
}
