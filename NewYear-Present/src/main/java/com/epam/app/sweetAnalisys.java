package com.epam.app;

import java.util.ArrayList;
import java.util.Scanner;

public class sweetAnalisys {
	static public int Sweets_weight;
	static public int Sweets_price;
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> Sweets = new ArrayList<String>();
    	Sweets.add("Laddu");
    	Sweets.add("khaja");
    	Sweets.add("Gelabi");

    	
		int weight[] = new int[Sweets.size()];
		int price[] = new int[Sweets.size()];
    	Laddu la = new Laddu();
    	Khaja ka =new Khaja();
    	Gelabi ge = new Gelabi();
    	System.out.println("Getting Sweets weights:-");
    	
    	ka.getWeight(scan.nextInt());
    	la.getWeight(scan.nextInt());
    	ge.getWeight(scan.nextInt());
    	System.out.println("Laddu = "+la.weight+" grms\n"+"\nKhaja = "+ka.weight+" grms\nGelabi = "+ge.weight +" grms\n");
    	
    	ka.calculate_w(ka.weight);
    	la.calculate_w(la.weight);
    	ge.calculate_w(ge.weight);
    	weight[0]=ka.display();
    	weight[1]=la.display();
    	weight[2]=ge.display();
    	
    	System.out.println("Enter number of sweets:");
    	int kac = scan.nextInt();
    	int lac = scan.nextInt();
    	int gec = scan.nextInt();
    	
    	ka.calculate_c(kac);
    	la.calculate_c(lac);
    	ge.calculate_c(gec);
    	price[0]=ka.display();
    	price[1]=la.display();
    	price[2]=ge.display();
    	
    	System.out.print("Total weight of sweets is: ");
    	Sweets_weight=weight[0]+weight[1]+weight[2];
    	System.out.println(Sweets_weight + " grams\n\n");
    	
    	System.out.print("Total price of sweets is: ");
    	Sweets_price=price[0]+price[1]+price[2];
    	System.out.println(Sweets_price + " Rc.\n\n");
	}
}
