package com.association;

public class AssociationPractice {

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		
		emp.setName("veena");
		Date date = new Date(1,8,2024);
		emp.setJoinDate(date);
		System.out.println("Name : " + emp.getName());
		Date joDate = emp.getJoinDate();
		System.out.println("joinDate : " + joDate.getDay()+"/ "+ joDate.getYear()+ "/" +joDate.getMonth());
	}

}
