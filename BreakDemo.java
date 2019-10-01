package com.nt.operators;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean x=true;
		bI1:{
			bI2:{
				bI3:{
					System.out.println("Block3::");
					if(x) break bI1;
					
				}
		System.out.println("Block2::");

			}
		
		System.out.println("Block1::");
		}

	}

}
