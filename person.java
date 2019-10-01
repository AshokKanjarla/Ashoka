package com.nt.oops;

public class person {
	
	String name;
	int age;
	
	person(){ // intialization
		this.name="rao";
		this.age=19;
	}
	person(int age){// intialization
		this.name="harish";
		this.age=age;
		System.out.println("this is one parameter value");
	}
	person(int age , String name){// intialization
		this.name=name;
		this.age=age;
		System.out.println("this is two parameter value");
	}
	
	
	//modifier returntype methodname (parameters){---}

	public void talk() {
		System.out.println("Hello i am ::"+name);
		System.out.println("my age is  ::"+age);


	}
	public int talk1() {
		System.out.println("Hello i am ::"+name);
		System.out.println("my age is  ::"+age);
		int x=10,y=20;
		int z=x*y;
		return z;
		
	}
	
public float talk2() {
	System.out.println("Hello i am ::"+name);
	System.out.println("my age is  ::"+age);
	return 10.2f;
	
}
public char talk3() {
	System.out.println("Hello i am ::"+name);
	System.out.println("my age is  ::"+age);
	return 'y';
	
}
public String talk4() {
	System.out.println("Hello i am ::"+name);
	System.out.println("my age is  ::"+age);
	return "wellcome to home Abi";
	
}
}
