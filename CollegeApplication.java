package com.nt.operators;

import java.util.Scanner;

public class CollegeApplication {

	private static final int Options = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentAccount obj1 = new StudentAccount("Ashok","123113");
		obj1.showMenu(Options);
	}

}
	class StudentAccount{
		private static final char Options = 0;
		int Balance;
		int StudentBalance;
		String StudentName;
		String StudentId;
		
	

		void deposit(int Amount){
			if (Amount != 0){
				Balance = Balance+ Amount;
				StudentBalance = Amount;
			}
		}
			StudentAccount(String cname, String cid){
				StudentName = cname;
				StudentId = cid;
				
			}
				
		
		
		void withdraw (int amount){
			if (amount !=0){
				Balance=Balance- amount;
				StudentBalance = Balance-amount;
				
			}
		}
		
			void getStudentBalance(){
				if(StudentBalance > 0){
					System.out.println("Deposit:"+ StudentBalance);	
				}else if(StudentBalance < 0){
					System.out.println("withdraw:"+StudentBalance);
			}else{
				System.out.println("No Amount is deducted from StudentBalance");
			}
			}	
			void showMenu(int Options){
				Scanner s1 = new Scanner(System.in);
				System.out.println("Wellcome to StudentAccount"+StudentName);
				System.out.println("Enter Your student Id"+StudentId);
				System.out.println("\n");
				System.out.println("A.Check StudentCredits");
				System.out.println("B.StudentBalance");
				System.out.println("C.StudentRank");
				System.out.println("D.StudentAmount");
				System.out.println("E.Exit");
				
				do{
					System.out.println("====================================");
					System.out.println("Enter Students Options");
					System.out.println("=====================================");
					Options = Scanner.charAt(0);
					System.out.println("\n");
					
					switch(Options){
					case 'A':
						System.out.println("=========================================");
						System.out.println("Balance" + Balance);
						System.out.println("==========================================");
						System.out.println("\n");
						break;
						
					case 'B':
						System.out.println("============================================");
						System.out.println("Enter an amount to deposit");
						System.out.println("=============================================");
						int amount =Scanner.nextInt();
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
						getStudentBalance();
						System.out.println("==================================================");
						System.out.println("\n");
						break;
						
					default:
						System.out.println("Invalid Option!. Please enter again");
						break;
					}
				}while(Options != 'E');
				System.out.println("Thanks for Using our Services");
				}
				}
				
				
					
			
				
			
			
		
		
	
