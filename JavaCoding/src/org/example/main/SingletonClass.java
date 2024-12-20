package org.example.main;

class Singelton{
	private int num1;
	private int num2;
	

private Singelton(){
	this.num1 = 20;
	this.num2 = 30;
	
	
}
private static Singelton ref = null;

public static Singelton  getRefrence() {
	if(ref == null) {
		ref = new Singelton();	
	}
	return ref;
	
}

}
public class SingletonClass {
  public static void main(String[] args) {
	Singelton s1 =  Singelton.getRefrence();
	Singelton s2 =  Singelton.getRefrence();
	
}
}
