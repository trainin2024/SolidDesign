package com.srp.after;

import java.util.List;

public class Customer {
		 
	    String name;
	    int age;
	    long billamount;
	    Bill bill = new Bill();
	    Customer(String name,int age)
	    {
	        this.name=name;
	        this.age=age;
	        this.billamount=bill.calculateBill(5);
	       
	    }
	    public String getName() {
	        return name;
	    }
	 
	    public void setName(String name) {
	        this.name = name;
	    }
	 
	    public int getAge() {
	        return age;
	    }
	 
	    public void setAge(int age) {
	        this.age = age;
	    }
	 
	    public long getBill() {
	        return billamount;
	    }
	 
	    public void setBill(long tax) {
	    	
	        this.billamount =  bill.calculateBill(20);
	    }
	 
	}
