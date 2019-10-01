package com.nt.operators;

import java.util.Scanner;

public class age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Sc=new Scanner(System.in);
		
		System.out.println("Enter your year");
		int year =Sc.nextInt();
		
		if(year%4 == 0){
			System.out.println("It is a leap year");
			
		}else{
			System.out.println("It not a leap year");
		}
		

	}

}
