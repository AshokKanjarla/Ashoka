package com.nt.oops;

public class Persons {

	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	void swap(int num1 , int num2) {
		int temp;
		System.out.println("Before Swapping :: num1::"+num1+"num2::"+num2);
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("after Swapping :: num1::"+num1+"num2::"+num2);
	}
	void swap1(Employee obj){
	int temp;
	temp=obj.id1;
	obj.id1= obj.id2;
	obj.id2=temp;
	}
}
