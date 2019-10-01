package com.nt.oops;

public class StaticSample {
	static{
	System.out.println("Static block of StaticSample");	
	}

 static int X=20;
 int y=10;
 
 StaticSample(){
	 System.out.println("StaticSample constructor");
 }
 
 
 
	//Modifier return methodname(parameter list){}
	
	  static double sum(double num1, double num2) {
		  System.out.println("sumis started");
		   double res=num1+num2+X;
		  return res;
	  }
	  public void s1(){
		System.out.println("X::"+X);
		System.out.println("y::"+y);
	  }
	  
	  
	}
	