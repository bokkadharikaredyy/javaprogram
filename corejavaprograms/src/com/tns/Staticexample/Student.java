package com.tns.Staticexample;

public class Student {
	int rollno;
	String name;
	static String college="SRI INDU";
	static void change() {
		college="SIIET";
		
	}
	Student(int r,String n){
		rollno=r;
		name=n;
		
	}
void display()
{
	System.out.println(rollno+" "+name+" "+" college");
}
}
