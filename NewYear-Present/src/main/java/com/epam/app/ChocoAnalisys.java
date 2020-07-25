package com.epam.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ChocoAnalisys {
	public static int tw_choco = 0;
	public static int tc_choco = 0;
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Size of Dairy Milk = Large\nSize of Snickers = Small");
    	DairyMilk dh = new DairyMilk();
    	Snickers sn = new Snickers();
    	
    	System.out.println("Enter size of Dairy Milk (1 to 10): ");
    	dh.getsize(scan.nextInt());
    	
    	System.out.println("Enter size of Snickers (1 to 10): ");
    	sn.getsize(scan.nextInt());
    	
    	System.out.println("Enter quantity of Dairy Milk: ");
    	int dq = scan.nextInt();
    	
    	System.out.println("Enter quantity of Snickers: ");
    	int sq = scan.nextInt();
    	
    	System.out.println("Enter price of Dairy Milk: ");
    	dh.price = scan.nextInt();
    	
    	System.out.println("Enter price of Snickers: ");
    	sn.price = scan.nextInt();
    	
    	
    	System.out.println("Sort By Option:");
    	System.out.println("1.Size\n2.Name\nEnter your choice: ");
    	int op = scan.nextInt();
    	int dm = dh.display();
    	int ss = sn.display();
    	ArrayList<String> ch = new ArrayList<String>();
    	if(op==1) {
    		if(dm>ss){
        		ch.add("Dairy Milk");
        		ch.add("Snickers");
        	}
        	else{
        		ch.add("Snickers");
        		ch.add("Dairy Milk");
        	}
        	System.out.println(ch+"\n\n");
    	}
    	else if(op==2) {
    		ch.add("Snickers");
    		ch.add("Dairy Milk");
    		Collections.sort(ch);
    		System.out.println(ch);
    	}
    	else {
    		System.out.println("Invalid Input");
    		return;
    	}
    	
    	tw_choco = dh.total_w(dq) + sn.total_w(sq);
    	System.out.println(tw_choco +" Grms");
    	
    	tc_choco = dh.total_p(dq) + sn.total_p(sq);
    	System.out.println(tc_choco +" Rc.");
	}
	
}

