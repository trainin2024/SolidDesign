package com.srp.after;

public class Bill {
	
	long bill;
	  // Calculate bill should not be responsibility of customer
    public long calculateBill(long tax)
    {
       bill=1000*tax;
        return bill;
    }
 

}
