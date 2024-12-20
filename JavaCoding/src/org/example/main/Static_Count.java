package org.example.main;



class Testt{
	public static  int  count = 0;
	
	public Testt() {
		Testt.count = Testt.count + 1 ;
		
	}
	public static int getCount() {
		return count;
	}
	
	
}
public class Static_Count {

	public static void main(String[] args) {
		System.out.println("static count : "+ Testt.getCount());
		Testt testt= new Testt();
		Testt test2= new Testt();
		Testt test3= new Testt();
		
		System.out.println("ststic count : "+ Testt.getCount());

	}

}
