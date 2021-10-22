package CoffeeShop;

import java.util.Scanner;

public class MainMenu implements State{

	@Override
	public void Status(Context context) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("--------STAR BUCKS MENU OPTIONS--------\n" + 
		"1) Menu Selections \n" + 
		
		"2) View All Menus\n" + "3)Checkout \n"+ "4) Exit \n" );
		
		System.out.print("");

		int input = sc.nextInt();
		if(input ==1) {
			ViewCoffeeMenuState viewCoffee = new ViewCoffeeMenuState();
			viewCoffee.Status(context);
			//insert View Drink Menu State Here
		}else if(input==2) {
			ViewAllState viewAll=new ViewAllState();
			viewAll.Status(context);
		}else if(input==3) {
			CheckoutState checkout=new CheckoutState();
			checkout.Status(context);
		}else {
			System.exit(0);
		}
		context.setState(this);
	}
}

