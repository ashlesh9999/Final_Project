package CoffeeShop;

public class ViewCoffeeMenuState  implements State{

		public void Status(Context context) {
			CoffeeFactory menuFactory = new CoffeeFactory();
			menuFactory.chooseMenu();
		}
	}
