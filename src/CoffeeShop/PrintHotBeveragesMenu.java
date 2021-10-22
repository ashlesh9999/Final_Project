package CoffeeShop;

public class PrintHotBeveragesMenu implements printMenus{
	HotBeveragesMenu hotBeveragesMenu;
	HotBeverages hotBeverages;
	
	public PrintHotBeveragesMenu(HotBeveragesMenu hotBeveragesMenu) {
		this.hotBeveragesMenu = hotBeveragesMenu;
	}
	
	public void printMenu() {
		Iterator iterateBeerMenu = hotBeveragesMenu.createIterator();
		printMenu(iterateBeerMenu);
	}
	
	private void printMenu(Iterator iterator) {
		System.out.println("\n\n\n\n-----------------Hot Beverages-------------------\n\n");
		  System.out.println("Coffee Name \t Coffee Type \t Price");

		 
		while(iterator.hasNext()){
			HotBeverages hotBeverages = (HotBeverages) iterator.next();
			  
			  System.out.print(hotBeverages.getCoffeeName() + "\t");
			  System.out.print(hotBeverages.getCoffeeType()+"\t");
			  System.out.println(" $"+hotBeverages.getCost()+"\n");
			
		}
		 
	}
}
