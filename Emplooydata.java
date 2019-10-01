package com.nt.operators;

import java.util.Scanner;

public class Emplooydata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner SC =new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = SC.next();
		System.out.println("Name"+name);
		
		System.out.println("Enter your gender::M/F");
		String gen=SC.nextLine();
		System.out.println("Gender"+gen);
		
		System.out.println("Enter your age");
		int age=SC.nextInt();
		System.out.println("Age::"+age);
		
		

	}

}
