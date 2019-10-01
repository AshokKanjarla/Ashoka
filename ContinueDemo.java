package com.nt.operators;

public class ContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0 , j;
		lp1: while(i<3){
			System.out.println(i);
			
			lp2: for(j=1;j<=5;j++){
				System.out.println("\t"+j);
				
			}
			i++;
			System.out.println("---------------");
			
		}//while

	}//main

}//class
