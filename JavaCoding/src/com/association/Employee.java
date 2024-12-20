package com.association;

public class Employee {
   private String name;
   private Date joinDate;// Association
   
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Date getJoinDate() {
	return joinDate;
}

public void setJoinDate(Date joinDate) {
	this.joinDate = joinDate;
}

public Employee() {
	   this.joinDate = new Date();
   }
}
