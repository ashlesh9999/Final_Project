package CoffeeShop;

public abstract class HotBeverages extends Coffee {

	String hotCoffee;
	
	public void setCoffeeType() {
		this.coffeeType = "HotCoffee";
	}
	public String getHotCoffee() {
		return hotCoffee;
	}
	public void setHotCoffee(String hotCoffee) {
		this.hotCoffee = hotCoffee;
	}

}
