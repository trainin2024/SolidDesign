package com.isp.before;

public class Dog  extends Animal{

	@Override
	void feed() {
		System.out.println(" Feed called");
		
	}

	@Override
	void groom() {
		
		System.out.println(" groom called");
	}
	

}
