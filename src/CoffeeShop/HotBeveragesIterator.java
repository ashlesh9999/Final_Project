package CoffeeShop;

public class HotBeveragesIterator implements Iterator {

	HotBeverages[] hotBeveragesMenu;
	int position;
	public HotBeveragesIterator(HotBeverages[] hotBeveragesMenu) {
		this.hotBeveragesMenu = hotBeveragesMenu;
	}

	@Override
	public boolean hasNext() {
		if(position > hotBeveragesMenu.length || hotBeveragesMenu[position] == null) {
			return false;
		}
		else return true;
	}

	@Override
	public Coffee next() {
		HotBeverages hotBeverages = (HotBeverages) hotBeveragesMenu[position];
		position = position +1;
		
		return hotBeverages;
	}

}
