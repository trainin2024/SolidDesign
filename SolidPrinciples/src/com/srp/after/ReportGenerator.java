package com.srp.after;

public class ReportGenerator {


    //Report generation should not be responsibility of customer
    public void generateReport(String reportType)
    {
        if(reportType.equalsIgnoreCase("CSV"))
        {
            System.out.println("Generate CSV report");
        }
        if(reportType.equalsIgnoreCase("XML"))
        {
            System.out.println("Generate XML report");
        }
 
    }
}
