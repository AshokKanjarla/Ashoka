package com.nt.bufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employid {

	public static void main(String[] args) throws IOException{
		
	
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter your name ");
	String name = br.readLine();
	System.out.println("Name::"+name);
	
	System.out.println("Enter your id");
	int id =Integer.parseInt(br.readLine());
	System.out.println("ID::"+id);
	
	System.out.println("Enter your gender::M/F");
	char gen=(char)br.read();
	System.out.println("Gender::"+gen);
	
}
}
