package CoffeeShop;

public class ColdBeveragesIterator implements Iterator {

	ColdBeverages[] coldBeveragesMenu;
	int position;
	public ColdBeveragesIterator(ColdBeverages[] coldBeveragesMenu) {
		this.coldBeveragesMenu = coldBeveragesMenu;
	}

	@Override
	public boolean hasNext() {
		if(position > coldBeveragesMenu.length || coldBeveragesMenu[position] == null) {
			return false;
		}
		else return true;
	}

	@Override
	public Coffee next() {
		ColdBeverages coldBeverages= (ColdBeverages) coldBeveragesMenu[position];
		position = position +1;
		
		return coldBeverages;
	}

}
