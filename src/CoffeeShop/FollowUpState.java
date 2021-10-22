package CoffeeShop;

import java.util.Scanner;

public class FollowUpState implements State{
	public void Status(Context context) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What would you like to have ?\n"+
		"1)Order Coffee\n" + 
		"2)Return Home\n");
		
		int followUpCommand = sc.nextInt();
		
		if (followUpCommand==1) {
			
			ViewCoffeeMenuState goBackToMenu = new ViewCoffeeMenuState();
			goBackToMenu.Status(context);
		}
		else {
			MainMenu goHome = new MainMenu();
			goHome.Status(context);
		}
	}
}
