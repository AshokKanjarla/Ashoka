package com.nt.oops;

public class PersonsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persons p =new Persons();
		p.setName("Ashoka");
		p.setAge(22);
		
		System.out.println("name ::" +p.getAge());
		System.out.println("Age ::"+p.getName());
		System.out.println("---------------------------------");
		
		int num1=10;
		int num2=20;
		System.out.println("the num1::"+num1 +"num2"+num2);
		p.swap(num1, num2);
		
		System.out.println("the num1::"+num1 +"num2"+num2);
		System.out.println("-------------------------------------");
		System.out.println("\n\n\n");
		Employee obj1=new Employee(11,22);
		System.out.println("obj1.id1::" +obj1.id1+"obj1.id2::" +obj1.id2);
		p.swap1(obj1);
		System.out.println("obj1.id1::" +obj1.id1+"obj1.id2::" +obj1.id2);
		
		
		
	}
	
	
}
