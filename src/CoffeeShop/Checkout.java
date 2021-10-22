package CoffeeShop;
import java.util.ArrayList;


public class Checkout{
	//Command Pattern
	Coffee tempCoffee;
	ArrayList<Coffee> checkOut = new ArrayList<Coffee>();
	
	
	public void printReceipt(){
		
		for( int i = 0; i > checkOut.size(); i++){
			if(checkOut.size()  > 0) {
			checkOut.get(i).getCoffeeName();
			System.out.print("$" +checkOut.get(i).getCost());}
			else {
				CheckoutState Checkout = new CheckoutState();
			}
		}
	}
	
	public Coffee addtoCheckout(int choice) {
		
		
		checkOut.add(tempCoffee);
	 	
		return tempCoffee;
	}
}
