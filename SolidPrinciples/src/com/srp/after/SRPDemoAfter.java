package com.srp.after;

/*
 * If there is any change in the calculation of bill then we need to change Customer class.
If you want to add one more report type to generate, then we need to change Customer class.
*/
public class SRPDemoAfter {

	public static void main(String[] args) {
		Customer customer = new Customer("Alex",100);
		System.out.println("Customer Name: "+customer.getName());
		customer.setBill (50L);
		System.out.println("Bill with tax" +customer.bill );
		
	}
}
