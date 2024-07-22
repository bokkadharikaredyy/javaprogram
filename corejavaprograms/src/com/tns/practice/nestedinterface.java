package com.tns.practice;

import com.tns.interfacedemo.Nestedinterface;

public class nestedinterface implements interface1.innerinterface1 {
	public void show()
	{
		System.out.println("inner interface");
		
	}
	public static void main(String[] args) {
		nestedinterface n= new nestedinterface();
		System.out.println(nestedinterface.a);
	}

}
