package com.VTI.entity;

public class Employee extends Staff {
private String task;
//khai báo contructor không tham số

//khai báo contructor đủ tham số
public Employee(int age, String name, Gender gender, String address, String task) {
	super(name, age, gender, address);
	this.task = task;
}
//khai báo geter seter

public String getTask() {
	return task;
}

public void setTask(String task) {
	this.task = task;
}


}
