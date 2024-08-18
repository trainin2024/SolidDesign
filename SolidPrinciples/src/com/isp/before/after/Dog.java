package com.isp.before.after;

public class Dog  extends Pet{

	@Override
	void feed() {
		System.out.println(" Feed called");
		
	}

	@Override
	void groom() {
		
		System.out.println(" groom called");
	}
	

}
