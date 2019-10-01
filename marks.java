package com.nt.oops;
  import java.util.Scanner;
  public class marks{
Scanner Sc = new Scanner(System.in);
  int marks;

  marks(int marks){
	  this.marks=marks;
  }
   public void subjects(){
	  
	   System.out.println("Enter Telugu marks");
	   int Telugu  =Sc.nextInt();
	   System.out.println("Enter Hindi marks");
	   int Hindi  =Sc.nextInt();
	   System.out.println("Enter English marks");
	   int English  =Sc.nextInt();
	   System.out.println("Enter Maths marks");
	   int Maths  =Sc.nextInt();
	   System.out.println("Enter Science marks");
	   int Science  =Sc.nextInt();
	   System.out.println("Enter Social marks");
	   int Social  =Sc.nextInt();
	   marks  = Telugu+Hindi+English+Maths+Science+Social;
	   System.out.println("Total marks"+ marks);
	  double Avg =  marks/600*100;
		System.out.println("Average of marks"+ Avg );
		
	   
   }
  
 
        
	
}
