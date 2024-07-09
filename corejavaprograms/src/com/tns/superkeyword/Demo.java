package com.tns.superkeyword;

public class Demo extends Superrex {
	int a=7;
	void Drinking() {
		System.out.println("tea");
		}
	void display() {
		System.out.println(a);
		System.out.println(super.a);
		Drinking();
		super.Drinking();
	
	}
	Demo()
	{
		super();
		
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.display();
		
	}

}
