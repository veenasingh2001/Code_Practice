package com.example.Inheritence;

class M{
	public int num;
	public int num2;
	public  M() {
		
	}
    public  M(int num, int num2) {
		this.num=num;
		this.num2 = num2;
	}
	public void showRecord() {
		System.out.println("Num1 : " + this.num);
		System.out.println("Num2 : " + this.num2);
	}
	public void printRecord() {
		System.out.println("Num1 : " + this.num);
		System.out.println("Num2 : " + this.num2);
	}
}
class N extends M{
	public int num3;
    public  N() {
	    this.num3 = num3;	
	}
    public  N(int num, int num2,int num3) {
		super(num,num2);
		this.num3= num3;		
		
	}
	public void dispay() {
		super.showRecord();
		System.out.println("Num3 : " + this.num3);
	}
	public void printRecord() {
		super.printRecord();
		
		System.out.println("Num3 : " + this.num3);
	}
	
}
public class Upcasting {
 public static void main(String[] args) {
	M m = new M();
	m.num = 10;
	m.num2 = 29;
	//m.num3   not ok
	m.showRecord();
	System.out.println("****************");
	N n = new N();
	n.num = 40;
	n.num2 = 70;
	n.num3 = 80;
	n.dispay();
	System.out.println("****************");
	N n2 = new N();
	M m2 = n2;  // upcasting n2 refress is assing to m2 means sub class refrence is assiening to super class
	m2.num = 100;
    m2.num2 = 200;
    // m2.num3 = 300;// not ok
  //  m2.dispay();// not ok
    m2.showRecord();

    System.out.println("****************");
    n2.num = 100;
    n2.num2 = 200;
    n2.num3 = 300;
    n2.dispay();
    
    
 }
}
