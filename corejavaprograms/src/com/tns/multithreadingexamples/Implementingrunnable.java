package com.tns.multithreadingexamples;

public class Implementingrunnable implements Runnable {
	public static void main(String[] args) {
		Implementingrunnable r=new Implementingrunnable();
		//new state
		//r.start();
		Thread t1= new Thread(r);
		t1.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("implementing runnable interface");
		
	}

}
