package com.nt.oops;

public class Prime {
	
	static boolean prime(long num) {
		boolean isprime = true;
		for (int i=2;i<= num ; i++)
			if(num%i == 0) isprime =false;
		
		return isprime;
	}

}
