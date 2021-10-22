package CoffeeShop;

public class PrintColdBeveragesMenu implements printMenus{
	ColdBeveragesMenu coldBeveragesMenu;
	ColdBeverages coldBeverages;
	
	public PrintColdBeveragesMenu(ColdBeveragesMenu coldBeveragesMenu) {
		this.coldBeveragesMenu = coldBeveragesMenu;
	}
	
	public void printMenu() {
		Iterator iterateBeerMenu = coldBeveragesMenu.createIterator();
		printMenu(iterateBeerMenu);
	}
	
	private void printMenu(Iterator iterator) {
		System.out.println("\n\n\n\n-----------------Cold Beverages-------------------\n\n");
		  System.out.println("Coffee Name \t Coffee Type \t Price");

		 
		while(iterator.hasNext()){
			ColdBeverages coldBeverages = (ColdBeverages) iterator.next();
			  System.out.print(coldBeverages.getCoffeeName() + "\t");
			  System.out.print(coldBeverages.getCoffeeType()+"\t");
			  System.out.println(" $"+coldBeverages.getCost()+"\n");
			
		}
		 
	}
}
