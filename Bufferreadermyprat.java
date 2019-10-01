package com.nt.bufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bufferreadermyprat {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
  System.out.println("Enter your integer");
  int x =Integer.parseInt(br.readLine());
  System.out.println("x::"+x);
  
  System.out.println("Enter your String");
  String S=br.readLine();
  System.out.println("S::"+S);
  
  System.out.println("Enter your Char");
  char C=(char)br.read();
  System.out.println("C::"+C);
  
 
	}

}
