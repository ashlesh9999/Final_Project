package CoffeeShop;

public abstract class Coffee {
	String coffeeName, coffeeType;
	double cost;
	String description;
	


	public String getCoffeeName() {
		return coffeeName;
	}
	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}
	public String getCoffeeType() {
		return coffeeType;
	}
	public void setCoffeeType(String coffeeType) {
		this.coffeeType = coffeeType;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}