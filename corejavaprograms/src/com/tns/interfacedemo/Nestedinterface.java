package com.tns.interfacedemo;

public class Nestedinterface implements Myinterface.Myinnerinterface {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("inner interface");
		
		
	}
	public static void main(String[] args) {
		Nestedinterface n=new Nestedinterface();
		System.out.println(Nestedinterface.id);//static variables should be 
		//accessed in the static way only

		
		
	}

}
