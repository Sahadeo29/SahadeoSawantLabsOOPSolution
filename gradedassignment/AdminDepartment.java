package com.greatlearning.gradedassignment;

//Admin Department inherits Super Department
public class AdminDepartment extends SuperDepartment {
	public void departmentName() {
		System.out.println("Welcome to Admin Department");
	}
	public void getTodaysWork() {
		System.out.println("Complete your documents submission");
	}
	public void getWorkDeadline() {
		System.out.println("Complete by EOD");
	}
}