package com.example.Inheritence;

class First{
	public int num= 10;
	public int num2 = 20;
	//for asscesing private field of super class we need getter setter
	private int sum ;
	
	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public void add() {  // same method
		System.out.println("addd : "+(num + num2));
	}
}
class Second extends First{
	public int num3= 400;
	public int num4 = 500;
	
	private int sum2;
	
	public int getSum2() {
		return sum2;
	}

	public void setSum2(int sum2) {
		this.sum2 = sum2;
	}

	public void add() {// same method
		//super.add();
		System.out.println("addd : "+(num3 + num4));
	
}
	}
public class Methods {
	
	//for asscesing private field of super class we need getter setter
	public static void main(String[] args) {
		 First f = new First();
		   f.setSum(55);
		 Second b = new Second();
			b.setSum2(66);

		System.out.println("sum1 : "+f.getSum());
		System.out.println("sum2 "+ b.getSum2());
	}
 public static void main1(String[] args) { 
	 First f = new First();
	f.add();
	
	Second b = new Second();
	b.add();
	

}
}
