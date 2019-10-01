package com.nt.oops;

public class personDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main is started");
		
		person p =new person();
		 p.age=20;
		 p.name="ashok";
		 
		 p.talk();
		 
		 person p1=new person();
		 p1.age=19;
		 p1.name="rani";
		 
		 p1.talk();
		 
		 person p2=new person();
		 p2.talk();
		 
		 person p3=new person(31);
		 p3.talk();
		 
		 person p4=new person(21, "anvesh");
		 
		 
		 p4.talk();
		 
		 
		 System.out.println("main is ended");
		 
		 int a=p4.talk1();
		System.out.println(a);
		
		System.out.println(p4.talk2());
		
		System.out.println(p4.talk3());
		
		System.out.println(p4.talk4());
		 
	}

}
