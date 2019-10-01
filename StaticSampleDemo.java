package com.nt.oops;

public class StaticSampleDemo {
	static{
		System.out.println("Static block of StaticSampleDemo");	
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println("main started ");
		double X=StaticSample.sum(10.22, 22.5);
		 System.out.println("x::"+X);	
		 
		 
		 
		
		StaticSample ss = new StaticSample();
		ss.s1();
		StaticSample ss1 = new StaticSample();
		System.out.println("After pre increment");
		++ss.y;
		
		ss.s1();
		ss1.s1();
		

		
		System.out.println("main ended");
		
	}

}
