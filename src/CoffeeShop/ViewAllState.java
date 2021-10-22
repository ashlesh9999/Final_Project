package CoffeeShop;

import java.util.Scanner;

public class ViewAllState implements State {

	@Override
	public void Status(Context context) {
		printAllMenus printAll = new printAllMenus();
		printAll.printColdBeveragesMenu();
		System.out.println("\n\n");
		printAll.printHodBeveragesMenu();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("\n\n\nWhat would you like to do next?\n"+
		"1) Main Menu\n"+
		"2) Checkout\n");
		int nextCommand=sc.nextInt();
		if(nextCommand==1) {
			MainMenu goBacktoMainMenu= new MainMenu();
			goBacktoMainMenu.Status(context);
		}else if(nextCommand==2) {
			CheckoutState checkout=new CheckoutState();
			checkout.Status(context);
		}
		context.setState(this);
	}

}
