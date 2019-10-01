package com.nt.oops;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Bankaccount {
	
	private double bal;
	//private double rate;
	Bankaccount(double b){
		bal=b;
		
	}
	 void contact(double r) throws IOException{
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter your Password");
		 String password =br.readLine();
		 	if(password.equals("xyz123")){
		 		Interest in=new Interest(r);
		 		in.calculateIntrest();
		 	}else{
		 		System.out.println("Sorry , Your access is denied");
		 		return;
		 		
		 	}
	 }
		
	private class Interest{
		private double rate;
		Interest(double r){
			rate= r;
			
			
		}
		 void calculateIntrest(){
			 double interest = bal*rate/10;
			 bal+= interest;
			 System.out.println("Balance = "+bal);
		 }
		
		
	}

}
