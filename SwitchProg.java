package com.nt.operators;
 import java.util.Scanner;

public class SwitchProg {

	private static String id;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner S=new Scanner(System.in);
		System.out.println("Enter a id"+id);
		int id=S.nextInt();
		
		switch(id){
		
		case 1: System.out.println("you had to sleep");
		break;
		case 4:System.out.println("you need to wake up");
		break;
		
		case 6: System.out.println("you need to make break fast");
		break;
		 
		case 8:System.out.println("you need to start to College");
		break;
		}
		
	}

}
