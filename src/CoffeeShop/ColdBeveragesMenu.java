package CoffeeShop;

public class ColdBeveragesMenu  {
	int numberOfItems = 0;
	ColdBeverages[] coldBeveragesMenu;
	
	public ColdBeveragesMenu() {
		
		coldBeveragesMenu = new ColdBeverages[3];
		
		coldBeveragesMenu[0] = new CappuccinoOnIce();
		coldBeveragesMenu[1] = new CreamyIcedCoffee();
	
	}
	
	public Iterator createIterator() {
		return new ColdBeveragesIterator(coldBeveragesMenu);
	}
}
