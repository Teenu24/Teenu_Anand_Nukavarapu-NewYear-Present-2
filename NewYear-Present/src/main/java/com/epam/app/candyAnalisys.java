package com.epam.app;

import java.util.Scanner;

public class candyAnalisys {
	public static int tw_candies;
	public static int tp_candies;
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Maximum number of candies: " + candies.range);
    	Jelly jy = new Jelly();
    	Lollipop lo = new Lollipop();
    	System.out.println("Enter Quantities of Jelly and Lollipop:");
    	jy.quantity(scan.nextInt());
    	lo.quantity(scan.nextInt());
    	if(jy.quantity+lo.quantity<=candies.range) {
    	System.out.println("Options:\n1.Quantity\n2.Total Candies");
    	int opc = scan.nextInt();
    	if(opc==1) {
    		System.out.println("Enter quantity of range within:");
    		int qun = scan.nextInt();
    		if(jy.display()<=qun) {
    			System.out.println("Jellys are in range of "+qun);
    			System.out.println("No of Jellys are : "+jy.display());
    		}
    		else {
    			System.out.println("Lollipops are in range of "+qun);
    			System.out.println("No of Lollipop are : "+lo.display());
    		}
    	}
    	else if(opc==2) {
        	int total_range = jy.display()+lo.display();
        	if(total_range<candies.range) {
        		System.out.println("Candies are with in range");
            	System.out.println("Total number of candies in the present are : " + total_range);
        	}
        	else {
        		System.out.println("Candies are not in range");
        	}
    	}
    	else {
    		System.out.println("Enter Valid input");
    		return;
    	}
    	tw_candies = lo.cal_w(lo.quantity)+jy.cal_w(jy.quantity);
    	System.out.println("Total weight of candies: "+tw_candies+" grms\n");
    	
    	tp_candies = lo.cal_p(lo.quantity) + jy.cal_p(jy.quantity);
    	System.out.println("Total price of candies: "+tp_candies+" Rc.\n");
    	}
    	else {
    		System.out.println("Candies out of range");
    		return;
    	}
	}
}
