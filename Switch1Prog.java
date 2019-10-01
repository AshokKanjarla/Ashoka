package com.nt.operators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.Buffer;

public class Switch1Prog {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader BR =new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Enter your age");
		int age=Integer.parseInt(BR.readLine());
		
		switch(age){
		
		case 10:System.out.println("You can't love");
		break;
		case 15: System.out.println("you can smoke");
		break;
		case 20:System.out.println("you can love");
		break;
		case 25:System.out.println("you can marry");
		break;
		default:
			System.out.println("you are a kid");

	}


	}

}
