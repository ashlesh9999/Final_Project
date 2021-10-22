package CoffeeShop;

import java.util.Scanner;

public class CoffeeFactory{
	public void chooseMenu() {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\n-------------SELECT MENU----------------\n\n"+
		"1) Cold Beverages Menu\n"+
		"2) Hot Beverages\n" + "3)Home Screen");
		
		
		int menuChoice = sc.nextInt();
		
		
		if(menuChoice ==1) {
			ColdBeveragesMenu coldBeveragesMenu = new ColdBeveragesMenu();
			PrintColdBeveragesMenu printColdBeveragesMenu = new PrintColdBeveragesMenu(coldBeveragesMenu);
			printColdBeveragesMenu.printMenu();
		}
		
		else if(menuChoice ==2) {
			HotBeveragesMenu hotBeveragesMenu = new HotBeveragesMenu();
			PrintHotBeveragesMenu printHotBeveragesMenu = new PrintHotBeveragesMenu(hotBeveragesMenu);
			printHotBeveragesMenu.printMenu();
		}else {
			Context context= new Context();
			MainMenu mainMenu= new MainMenu();
			mainMenu.Status(context);
			
		}
		Context context = new Context();
		
		FollowUpState followUp = new FollowUpState();
		followUp.Status(context);
	}

}
