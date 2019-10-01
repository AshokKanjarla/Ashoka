package com.nt.operators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ifelseprog {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
     
		BufferedReader BR =new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Enter your age");
		int age=Integer.parseInt(BR.readLine());
		
		if(age<=10){
		System.out.println("you are a kid");}
		else if (age>18 && age<25){
		System.out.println("you are young");}
		else if (age>25 && age<65){
			System.out.println("you are a youth");}
	
		
		
		}
		}
	


