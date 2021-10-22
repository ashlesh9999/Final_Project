package CoffeeShop;

public class HotBeveragesMenu {
	int numberOfItems = 0;
	HotBeverages[] hotBeveragesMenu;
	
	public HotBeveragesMenu() {
		
		hotBeveragesMenu = new HotBeverages[6];
		
		hotBeveragesMenu[0] = new CafeAmericano();
		hotBeveragesMenu[1] = new CaramelMacchiato();
		hotBeveragesMenu[2] = new Doppio();
		hotBeveragesMenu[3] = new FlatWhite();
	
	}
	
	public Iterator createIterator() {
		return new HotBeveragesIterator(hotBeveragesMenu);
	}
}
