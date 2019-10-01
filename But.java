package com.nt.oops;
import java.awt.Button;
import java.awt.Frame;
public class But extends Frame{
	But(){
		Button b=new Button("ok");
		
		add(b);
		
		b.addActionListener(new Myclass());
	}
	public static void main(String args[]){
		
		But obj=new But();
		
		obj.setSize(400,300);
		obj.setVisible(true);
		
		
		
		
	}
}
