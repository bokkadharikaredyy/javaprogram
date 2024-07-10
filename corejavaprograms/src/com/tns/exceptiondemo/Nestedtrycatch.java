package com.tns.exceptiondemo;

public class Nestedtrycatch {
	public static void check()
	{
		String str="tns";
		int slength=str.length();
		System.out.println("String length"+str.length());
		String anotherstring=null;
		int y=6;
		try
		{
			try {
			System.out.println(str.charAt(y));
		}
		catch(StringIndexOutOfBoundsException ex)
		{
			System.out.println("String Index Out Of Bounds Exception "+ex.getMessage());
		}
		System.out.println("String Index Out Of Bounds Exception "+anotherstring.length());
	}
	catch(NullPointerException npe)
		{
		System.out.println("exception is thrown "+npe.getMessage());
		}
	}

}
