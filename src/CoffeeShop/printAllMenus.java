package CoffeeShop;

public class printAllMenus {
	
	public printAllMenus() {
		
		ColdBeveragesMenu coldBeveragesMenu = new ColdBeveragesMenu();
		PrintColdBeveragesMenu printColdBeveragesMenu = new PrintColdBeveragesMenu(coldBeveragesMenu);
		HotBeveragesMenu hotBeveragesMenu = new HotBeveragesMenu();
		PrintHotBeveragesMenu printHotBeveragesMenu =new PrintHotBeveragesMenu(hotBeveragesMenu);
		
		printColdBeveragesMenu = new PrintColdBeveragesMenu(coldBeveragesMenu);
		printHotBeveragesMenu =new PrintHotBeveragesMenu(hotBeveragesMenu);
	}
	
	public void printColdBeveragesMenu() {
		ColdBeveragesMenu coldBeveragesMenu = new ColdBeveragesMenu();
		PrintColdBeveragesMenu printColdBeveragesMenu = new PrintColdBeveragesMenu(coldBeveragesMenu);
		printColdBeveragesMenu.printMenu();
	}
	
	public void printHodBeveragesMenu() {
		HotBeveragesMenu hotBeveragesMenu = new HotBeveragesMenu();
		PrintHotBeveragesMenu printHotBeveragesMenu =new PrintHotBeveragesMenu(hotBeveragesMenu);
		printHotBeveragesMenu.printMenu();
	}

}
