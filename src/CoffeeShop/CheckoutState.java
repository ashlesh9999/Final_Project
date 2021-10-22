package CoffeeShop;

public class CheckoutState implements State{

	@Override
	public void Status(Context context) {
		ColdBeveragesMenu coldBeveragesMenu = new ColdBeveragesMenu();
		HotBeveragesMenu hotBeveragesMenu = new HotBeveragesMenu();
		
		System.out.print("This is a current place holder for the checkout state.");
		
		FollowUpState followUp = new FollowUpState();
		followUp.Status(context);
		context.setState(this);
	}

}
