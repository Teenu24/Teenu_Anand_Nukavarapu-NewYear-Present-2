package com.epam.app;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Enter maxixmam price:");
    	int max = scan.nextInt();
    	ArrayList<String> Candies = new ArrayList<String>();
    	ArrayList<String> Chocolates = new ArrayList<String>();
    	Candies.add("Jelly");
    	Candies.add("Lollipop");
    	Chocolates.add("DairyMilk");
    	Chocolates.add("Snickers");
    	
    	System.out.println("Sweets Class Calling:\n");
    	sweetAnalisys sa = new sweetAnalisys();
    	sweetAnalisys.main(args);
    	
    	System.out.println("Candies Class Calling:\n");
    	candyAnalisys cna = new candyAnalisys();
    	candyAnalisys.main(args);
    	
    	
    	System.out.println("\nChocolates Class Calling:\n");
    	ChocoAnalisys ca = new ChocoAnalisys();
    	ChocoAnalisys.main(args);

    	int Present_weight=0;
    	Present_weight = sweetAnalisys.Sweets_weight + candyAnalisys.tw_candies + ChocoAnalisys.tw_choco;
    	System.out.println("Total weight of the present is :" + Present_weight +" Grms");
    	
    	int Present_price=0;
    	Present_price = sweetAnalisys.Sweets_price+candyAnalisys.tp_candies+ChocoAnalisys.tc_choco;
    	if(max<Present_price) {
    		System.out.println("Gift price more than expected. Please get within range");
    	}
    	else {
    		System.out.println("Total price of the present is :" + Present_price +" Rc.");
    	}
    }

}
