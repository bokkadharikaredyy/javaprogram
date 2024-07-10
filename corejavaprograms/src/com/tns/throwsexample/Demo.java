package com.tns.throwsexample;

import java.io.IOException;

import com.tns.exceptiondemo.Main;

public class Demo {
	public static void main(String[] args) {
		Throwsdemo d=new Throwsdemo();
		try
		{
			d.display();		
		}
		catch(IOException e) {
			System.out.println("exception caught e"+e);
		}
	}

}
