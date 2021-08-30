package com.greatlearning.gradedassignment;

//Hierarchical Inheritance

//superclass SuperDepartment
public class SuperDepartment {
	public void departmentName() {
		System.out.println("Super Department");
	}
	public void getTodaysWork() {
		System.out.println("No Work as of now");
	}
	public void getWorkDeadline() {
		System.out.println("Nil");
	}
	public void isTodayAHoliday() {
		System.out.println("Today is not a holiday");
	}
}