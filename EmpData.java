package com.nt.operators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmpData {


	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter your id::");
		int id=Integer.parseInt(br.readLine());
		System.out.println("id::" +id);
		
		System.out.println("Enter your name");
		String name=br.readLine();
		System.out.println("name::"+ name );
		
		int M = 0,F = 0;
		System.out.println("Enter your gender ::"+M/F);
		char gen=(char)br.read();
		System.out.println("Gender"+gen);
		
		
	}
}


