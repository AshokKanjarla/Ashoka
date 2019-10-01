package com.nt.oops;

public class ThisSample {

	static{
		
		System.out.println("ThisSample block");
	}
	private int x;
	
	
	ThisSample(){
		this(55);
		this.access();
	}

	private void access() {
		// TODO Auto-generated method stub
		System.out.println("x=::"+x);
	}

	public ThisSample(int i) {
		// TODO Auto-generated constructor stub
		this.x=i;
	}
	
}
