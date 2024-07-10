package com.tns.finallydemo;

public class Test1 {
	public static void main(String[] args) {
		try
		{
			System.out.println(100/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("exceptiom caught"+e.getMessage());
		}
		finally {
			System.out.println("finally ");
		}
		
	}

}
