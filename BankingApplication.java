package com.nt.operators;

import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		//TODD Auto-generation method sub
		
		BankAccount obj1 =new BankAccount("XYZ","BA00001");
		obj1.showMenu();
			

	}

}

class BankAccount
{
	int balance;
	int previoustransaction;
	String CustomerName;
	String CustomerId;
	private Scanner scanner;
	
	BankAccount(String cname, String cid)
	{
		CustomerName = cname;
		CustomerId = cid;
		
	}

	void deposit(int amount){
		if(amount !=0){
		balance = balance+amount;
		previoustransaction = amount;
			
		}
}
	void withdraw(int amount){
		if(amount !=0)
		{
			balance=balance - amount;
			previoustransaction = -amount;
			
		}
	}
		void getprevioustransaction()
		{
			if (previoustransaction > 0)
			{
				System.out.println("Deposited :" +previoustransaction);
			}
			else if(previoustransaction < 0){
				System.out.println("Withdrawn:"+ Math.abs(previoustransaction));
			}
			else{
				System.out.println("No transcation Occured");
			}
		}
		

		
	void showMenu(){
		scanner = new Scanner(System.in);
		 
		 System.out.println("Welcome "+ CustomerName);
		 System.out.println("Your ID is "+ CustomerId);
		 System.out.println("\n");
		 System.out.println("A.Check Balance");
		 System.out.println("B.Deposit");
		 System.out.println("C. Withdraw");
		 System.out.println("D.previoustransaction");
		 System.out.println("E.Exit");	
	char option;
	do
	{
		System.out.println("========================================");
		System.out.println("Enter a option");
		System.out.println("==========================================");
		option = scanner.next().charAt(0);
		System.out.println("\n");	
		
		switch(option){
		case 'A':
			System.out.println("=========================================");
			System.out.println("Balance" + balance);
			System.out.println("==========================================");
			System.out.println("\n");
			break;
			
		case 'B':
			System.out.println("============================================");
			System.out.println("Enter an amount to deposit");
			System.out.println("=============================================");
			int amount =scanner.nextInt();
			deposit(amount);
			System.out.println("\n");
			break;
			
		case 'C':
			System.out.println("==============================================");
			System.out.println("Enter an amount to withdraw");
			System.out.println("===============================================");
			int amount2 = scanner.nextInt();
			withdraw(amount2);
			System.out.println("\n");
			break;
		case 'D':
			System.out.println("=================================================");
			getprevioustransaction();
			System.out.println("==================================================");
			System.out.println("\n");
			break;
			
		default:
			System.out.println("Invalid Option!. Please enter again");
			break;
			
			
		}
	}while(option != 'E');
	System.out.println("Thanks for Using our Services");
	}
	}
	
	
	