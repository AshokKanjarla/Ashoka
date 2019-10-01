package com.nt.oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BankAcct {
	 private double bal;
	 BankAcct(double b){
		 bal=b;
		 
	 }
	
	 void contact(double r) throws IOException{
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 
		 System.out.println("Enter your Password");
		 String passwd =br.readLine();
		 
		 if(passwd.equals("Ashok123")){
			 Interest in = new Interest(r);
			 in.calculateInterest();
		 }else{
			 System.out.println("Sorry,wrong Access");
			 return;
			 
		 }
		 
	 }
	 
	 
	 	private class Interest{
		  private double rate;
		  Interest(double r){
			  rate=r;
		  }
	 		void calculateInterest(){
	 			 double interest=bal*rate/10;
	 			 bal+=interest;
	 			 System.out.println("Balance ="+bal);
	 		 }
	 		
	 }
	 
}
