package com.tns.finallydemo;
//no exception
public class Test {
	public static void main(String[] args) {
		try
		{
			System.out.println("welcome");
		}
		catch(Exception e)
		{
			System.out.println("hello ");
		}
		finally
		{
			System.out.println("everyone");
		}
	}

}
