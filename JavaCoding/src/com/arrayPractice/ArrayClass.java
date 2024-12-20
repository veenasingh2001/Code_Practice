package com.arrayPractice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayClass {
  private static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
	int[] arr = new int[3];
	ArrayClass.acceptRecord(arr);
	ArrayClass.printRecord(arr);
}
  
  public static void main9(String[] args) {
	  int [] arr = new int[] {23,45,78};
	  Arrays.stream(arr)  // stream method of arrrays class
	  .forEach(element->System.out.println(element));// using lamda expression 
	  //.forEach(System.out::println);//  
	
}
  public static void main8(String[] args) {// for each loop
	  
	  int[] arr = new int[] {20,30,40};
	  for(int element : arr)
		  System.out.println("arr : " + element);
}
  public static void main7(String[] args) { // Array.tostring
	int[] arr = new int[] {10,20,30};
	System.out.println("arr : " +Arrays.toString(arr));
}
  private static  void acceptRecord(int[] arr) {
	  if(arr != null) {
	  for (int index = 0; index < arr.length; index++) {
		  System.out.println("Enter Element : ");
		  arr[index] = sc.nextInt();
		  }	
} }
  private static void printRecord(int[] arr) {
//	  for (int index = 0; index < arr.length; index++) {  this is simple for loop way to print the record
//		System.out.println("arr[0] : " + arr[index]);
//	}
	  if( arr != null) {
	  Arrays.stream(arr)   // latest way using Arrays .steam method 
	  .forEach(System.out::println);
	  
	  }
}
  
  public static void main5(String[] args) {   // arr as arungment pass
	  //int[] arr = new int[] {3,4,5};
	 // int[] arr = new int[3]; // default value is 0 0 0
	  int[] arr = ArrayClass.getArray();
	  ArrayClass.acceptRecord(arr);
	  ArrayClass.printRecord(arr);
	
}
  public static void main4(String[] args) {   // for loop
	  int[] arr = new int [3];
	 for (int i = 0; i < arr.length; i++) {
		System.out.println("Enter element: ");
		arr[i] = sc.nextInt();		
	}
	 for (int i = 0; i < arr.length; i++) {
		System.out.println("arr[0] : "+ arr[i]);
	}	  	
}
  
  public static void main3(String[] args) { // do while loop
		  int[] arr = new int [3];
		  int index = 0;
	do {
		System.out.print("Enter element : ");
		arr[index] = sc.nextInt();
		index = index + 1;
				} while (index<3);
	index = 0;
	do {
		System.out.println("arr[0] : "+ arr[index]);
		index = index+1;
	} while (index<3);
	 	  
}
  public static int[]  getArray() {
	  System.out.println("get arrrr");
	  int[] arr = new int[3];	  
	  return arr;	
}
  
  public static void main1(String[] args) {
	//int arr[] = new int[3] {3, 4, 5} not ok
		 // int arr[] = new int[] {3, 5, 6, 7}; // ok
		  int[] arr = new int[3];
		  //System.out.println("array leng : "+ arr.length);
		  System.out.println("enter element");
		  arr[0] = sc.nextInt();
		  System.out.println("enter element");
		  arr[1] = sc.nextInt();
		  System.out.println("enter element");
		  arr[2] = sc.nextInt();
		  
		  System.out.println("arr[0] : "+ arr[0]);
		  System.out.println("arr[1] : "+ arr[1]);
		  System.out.println("arr[2] : "+ arr[2]);
}
  public static void mainn(String[] args) {
	 int arr1 [] = new int[5]; // ok
	 int[] arr2 = new int[5]; // ok
	 int[] arr = null;    // ok
	 arr = new int[5];  // ok
	 
	 // user input of array
	 System.out.print("array :  ");
     int[] arr4 = new int[sc.nextInt()];
	//int[] arryy = new int[] {8,9,6,5};
	for (int i = 0; i < arr4.length; i++) {
		System.out.println("array " + arr4[i]++);
//		arr4 = new int[sc.nextInt()];
//		int j = arr4[i];
	//	System.out.println("array " + arryy[i]);
	}
	 
	// int[] aee = new int [-9]; // negative arrray size exception
	 
}
}
