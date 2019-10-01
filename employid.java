package com.nt.operators;
import java.util.Scanner;

public class employid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc= new Scanner(System.in);
		
		System.out.println("Enter your Name");
		String name =Sc.next();
		
		System.out.println("Enter your ID::");
		int ID=Sc.nextInt();
		System.out.println("Enter your Address");
		String Address =Sc.next();
		
		System.out.println("ID::"+ID);
		System.out.println("Name::"+name);
		System.out.println("Address::"+Address+Sc.hashCode());
		
	}

}
