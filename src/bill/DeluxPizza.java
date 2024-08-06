package bill;

public class DeluxPizza extends pizza {
	public DeluxPizza(Boolean veg) {
		super(veg);
	}
	
	public void addExtraCheese() {
		
		this.price += extraCheesePrice;
	}
	
	public void addExtraToopings() {

		this.price += extraToopingsPrice;
	}
	
}

class PizzaShop{
	void pizzafun(pizza ref) {
		ref.addExtraCheese();
		ref.addExtraToopings();
		ref.takeAway();
		ref.getBill();
	}
}
